package oops;

public class Employee {
// without private class
//	int eid;
//	String ename;
//	double salary;

	private int eid;
	private String ename;
	private double salary;
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int geteid() {
		return eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getename() {
		return ename;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
}


