class Person{
	String name, address;
	int age;

	Person(){
		name = "Unknown";
		age = 0;
		address = "Unknown";
	}

	Person(String name, int age, String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void displayInfo(){
		System.out.println();
		System.out.println("Name: " + name + " | Age: " + age + " | Address: " + address);
	}



}


