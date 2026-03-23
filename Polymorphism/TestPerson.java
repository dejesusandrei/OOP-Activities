class TestPerson{
	public static  void main(String andrei[]){

		Person p2 = new Person();
		p2.name = "Juan Dela Cruz";
		p2.age = 25;
		p2.address = "Malolos, Bulacan";
		p2.displayInfo();

		Person p3 = new Person();
		p3.setName("Pedro Penduko");
		p3.setAge(17);
		p3.setAddress("San Juan, Metro Manila");
		p3.displayInfo();

		Person p1= new Person("Maria Clara", 20, "Pulilan, Bulacan");
		System.out.println();
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getAddress());
	}
}