class Student extends Person{
	int sId;
	String sCourse;
	double sTfee;

	Student(){
		sId = 0;
		sCourse = "Unknown";
		sTfee = 0;
	}

	Student(int sId, String sCourse, double sTfee){
		this.sId = sId;
		this.sCourse = sCourse;
		this.sTfee = sTfee;
	}

	public void setId(int sId){
		this.sId = sId;
	}

	public int getId(){
		return sId;
	}

	public void setCourse(String sCourse){
		this.sCourse = sCourse;
	}

	public String getCourse(){
		return sCourse;
	}

	public void setTfee(double sTfee){
		this.sTfee = sTfee;
	}

	public double getTfee(){
		return sTfee;
	}

	public void dispStudInfo(){
		System.out.println();
		System.out.println("Student Information: ");
		System.out.println("Stud ID: " + sId);
		System.out.println("Name: " + name);
		System.out.println("Course: " + sCourse);
		System.out.println("Address: " + address);
		System.out.println("Age: " + age);
		System.out.printf("Tuition Fee: %.2f", sTfee);
	}



}


