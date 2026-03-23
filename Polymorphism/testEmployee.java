
public class testEmployee {
	public static void main(String args[]) {
	    Employee staff[] = {
	    	new Teacher(),
	    	new Programmer(),
	    	new Teacher(),
	    	new Programmer()
	    };
    
	    for(int i = 0; i < staff.length; i++){ staff[i].work(); }
	    System.out.println ();
	    for(Employee e : staff){ e.work(); }
	    System.out.println ();
	    
	    // To print only Teachers or Programmer
	    for(Employee e : staff){
	    	if(e instanceof Programmer) { e.work(); }
	 	}
    }
}

class Employee{
	public void work(){ System.out.println ("Work");}
}
class Teacher extends Employee{
	public void work(){ System.out.println ("Teacher Work");}
}
class Programmer extends Employee{
	public void work(){ System.out.println ("Programmer Work");}
}