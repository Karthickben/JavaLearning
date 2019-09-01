package StringTutorial;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class BankActivites {

	public static void main(String args[]) {
		Account karthick = new Account(123456789, 1000.00, "'KARTHICK'");
		Account ravi = new Account(987654321, 1000.00, "'RAVI'");
		Account ben = new Account(123777789, 1000.00, "'BEN'");

		new Thread(new Runnable() {

			@Override
			public void run() {
				// karthick.deposit(100.00);
				karthick.fundTransfer(ravi, 300.00);
				ravi.fundTransfer(ben, 200);
				ben.fundTransfer(karthick, 100);
				// ravi.withDraw(200.00);

			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				// ravi.deposit(400.00);
				// karthick.withDraw(150.00);
				karthick.fundTransfer(ben, 100.00);
				ravi.fundTransfer(karthick, 400);
				ben.fundTransfer(ravi, 200);

			}
		}).start();

	}

}

class Account {
	private ReentrantLock lock;
	private long accountNumber;
	private String accountHolderName;
	private double balance;

	public Account(long accountNumber, double balance, String accountHolderName) {
		this.lock = new ReentrantLock(true);
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountHolderName = accountHolderName;
	}

	public boolean deposit(double amount) {
		boolean status = false;

		try {
			if (this.lock.tryLock(10000, TimeUnit.MILLISECONDS)) {

				try {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					this.balance += amount;
					status = true;
					System.out.println(amount + " has been deposited to the account " + this.accountHolderName + " "
							+ "and the current balance is " + this.balance);

				} finally {
					// System.out.println("Transaction status for deposit: "+status);
					this.lock.unlock();
				}

			} else {
				System.out.println(this.accountHolderName + "'s account doesn't get lock for Deposit");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return status;

	}

	public boolean withDraw(double amount) {
		boolean status = false;
		try {
			if (this.lock.tryLock(10000, TimeUnit.MILLISECONDS)) {
				try {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					this.balance -= amount;
					status = true;
					System.out.println(amount + " has been withdrawed from the account " + "" + this.accountHolderName
							+ " and the current balance is " + this.balance);

				} finally {
					// System.out.println("Transaction status for withdrawal: "+status);
					this.lock.unlock();
				}
			} else {
				System.out.println(this.accountHolderName + "'s doesn't get lock for withdrwal");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return status;

	}

	public boolean fundTransfer(Account benificeryAccount, double amountToBeTransferred) {
		boolean status = false;

		if (withDraw(amountToBeTransferred)) {

			if (benificeryAccount.deposit(amountToBeTransferred)) {
				status = true;
				System.out.println("Fund Transfer from account " + this.accountHolderName + " has been completed.");

			} else {
				System.out.println("Destination Account " + benificeryAccount.accountHolderName
						+ " is busy please try after sometime. Amount  "
						+ "deducted will be credited into your account shortly");
				deposit(amountToBeTransferred);
				status = false;
			}

		} else {
			status = false;
			System.out.println("Transfer failed, please try later");
		}

		return status;

	}

	public long getAccountNumber() {
		return this.accountNumber;
	}

	public void printAccountNumber() {
		System.out.println("AccountNumber: " + this.accountNumber);
	}

}
