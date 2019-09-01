package StringTutorial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyImmutableClass employee = MyImmutableClass.EmployeeObjectFactory(751141);
		System.out.println("employee object value: " + employee.getEmployyeNumber());
		System.out.println("-------------------------------------------------------------");
		MyImmutableClass employee1 = MyImmutableClass.EmployeeObjectFactory(752000);
		System.out.println("employee1 object value: " + employee1.getEmployyeNumber());
		System.out.println("-------------------------------------------------------------");
		MyImmutableClass employee2 = MyImmutableClass.EmployeeObjectFactory(751141);
		System.out.println("employee2 object value: " + employee2.getEmployyeNumber());
		System.out.println("-------------------------------------------------------------");
		MyImmutableClass employee3 = MyImmutableClass.EmployeeObjectFactory(752000);
		System.out.println("employee3 object value: " + employee3.getEmployyeNumber());
		System.out.println("-------------------------------------------------------------");
		MyImmutableClass employee4 = MyImmutableClass.EmployeeObjectFactory(777777);
		System.out.println("employee4 object value: " + employee4.getEmployyeNumber());
		System.out.println("-------------------------------------------------------------");

		System.out.println("employee == employee2 :" + (employee == employee2));
		System.out.println("employee1 == employee3 :" + (employee1 == employee3));
		System.out.println("employee == employee1 :" + (employee == employee1));
		System.out.println("employee2 == employee3 :" + (employee2 == employee3));

		System.out.println("---------------------------------------------");
		Integer it = 10;
		Integer it1 = it;
		it = 11;
		Integer it2 = 10;
		System.out.println(it == it1);
		System.out.println(it2 == it1);

		String sample1 = new String("HELLO");
		String sample2 = new String("HELLO");
		System.out.println(sample1 == sample2);

		String sample3 = sample1;
		System.out.println(sample3 == sample1);
		System.out.println(sample3 == sample2);
		String sample4 = sample2.toUpperCase();
		System.out.println(sample4 == sample2);
	}

}
