class Employee{
	// PRIVATE ATTRIBUTES
	private String name;
	private String position;
	private double monthlySalary;
	
	// DEFAULT CONSTRUCTOR
	public Employee(){
		this.name = "Untitled";
		this.position = "Unknown";
		this.monthlySalary = 0.0;
	}

	// PARAMETARIZED 
	public Employee(String name, String position, double monthlySalary){
		this.name = name;
		this.position = position;
		this.monthlySalary = monthlySalary;
	}

	// SETTERS
	public void setName(String name){
		this.name = name;
	}

	public void setPosition(String position){
		this.position = position;
	}

	public void setMonthlyPrice(double monthlySalary){
		this.monthlySalary = monthlySalary;
	}

	// GETTERS
	public String getName(){
		return name;
	}

	public String getPosition(){
		return position;
	}

	public double getMonthlyPrice(){
		return monthlySalary;
	}

	// METHODS
	public double annualSalary(){
		return monthlySalary * 12;
	}

	public void giveRaise(double percent){
		double raise, finalRaise;
		
		if(percent > 0){
			raise = monthlySalary * percent;
			monthlySalary = raise + monthlySalary;	
			System.out.println("After  Raise (8%): ");
			System.out.printf("Monthly: %.2f\n", monthlySalary);
		}
	}

	public void printEmployeeInfo(){
		System.out.printf("Employee: " + name + " | Position: " + position + " | Monthly: %.2f\n" , monthlySalary);
	}

	

	
}