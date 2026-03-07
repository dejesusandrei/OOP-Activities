class EmployeeMain{
	public static void main(String andrei[]){
		Employee em1 = new Employee("Carlo Reyes", "Developer", 25000.00);
		em1.printEmployeeInfo();

		System.out.printf("Annual Salary: %.2f\n", em1.annualSalary());
		em1.giveRaise(0.08);

		System.out.printf("Annual Salary: %.2f\n", em1.annualSalary());
	}
}