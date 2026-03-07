class StudentConstructor{
	String name;
	int age;

	StudentConstructor(String  name, int age){
		this.name = name;
		this.age = age;
	}

	void display(){
		System.out.println("Name: " + name + ", Age: " + age);
	}
}