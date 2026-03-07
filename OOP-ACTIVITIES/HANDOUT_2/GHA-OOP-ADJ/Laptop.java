class Laptop{
	String brand;
	int ram;

	Laptop(String brand, int ram){
		this.brand = brand;
		this.ram = ram;
	}

	public void display(){
		System.out.println("Brand: " + brand + ", Ram: " + ram + "GB");
	}
}