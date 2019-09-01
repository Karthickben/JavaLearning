package StringTutorial;

import java.util.HashMap;

public final class MyImmutableClass {

	private int employyeNumber = 0;

	private static HashMap<Integer, MyImmutableClass> employeeList = new HashMap<>();

	private MyImmutableClass(int empNum) {
		this.employyeNumber = empNum;

	}

	public int getEmployyeNumber() {
		return employyeNumber;
	}

	public static MyImmutableClass EmployeeObjectFactory(Integer empNum) {

		MyImmutableClass empNumber = employeeList.getOrDefault(null, employeeList.get(empNum));
		if (empNumber == null) {
			System.out.println("New object is created");
			employeeList.put(empNum, new MyImmutableClass(empNum));
			return employeeList.get(empNum);
		} else {
			System.out.println("Employee Number already available: " + empNumber.employyeNumber);
			System.out.println("No new object is created");
			return empNumber;

		}

	}

}
