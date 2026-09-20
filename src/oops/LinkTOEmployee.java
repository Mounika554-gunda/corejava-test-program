package oops;

public class LinkTOEmployee {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
//		 If their is no private we write like this	
//		emp1.eid(7);
//		emp1.ename("Dhoni");
//		emp1.salary(1000000);
		
		emp1.setEid(7);
		emp1.setEname("Dhoni");
		emp1.setSalary(1000000);
		
		
		System.out.println( "Employee ID:" +emp1.geteid());
		System.out.println("Employee Name:" +emp1.getename());
		System.out.println("Employee Salary:" +emp1.getSalary());

	}

}
