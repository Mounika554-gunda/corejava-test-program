package constructors;

public class Copyconstructor1 {
	int empid;
	String empname;
	double salary;
	
	Copyconstructor1(Copyconstructor1 c){
		this.empid=c.empid;
		this.empname=c.empname;
		this.salary=c.salary;
	}
	
	Copyconstructor1(int empid, String empname, double salary) {
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}
	Copyconstructor1(double salary){
		this.salary = salary;
	}
	
	void increment() {
		empname = "ravi";
		salary = 10000+salary;
	}
	
	
	void display() {
		System.out.println("Employee ID:" +empid);
		System.out.println("Employee Name:" +empname);
		System.out.println("Salary:" +salary);
	}

	public static void main(String[] args) {
		Copyconstructor1 c1 = new Copyconstructor1(101,"krishna",90000);
		c1.display();
		
		Copyconstructor1 c2 = new Copyconstructor1(c1);
		c2.increment();
		c2.display();
		
		

	}

}
