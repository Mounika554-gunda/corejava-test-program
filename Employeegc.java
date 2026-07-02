package myfirstjavaproject;

public class Employeegc {

	
			
			@Override
			protected void finalize() throws Throwable {
				System.out.println("object destroyed");
			}
			String empname;
			int salary;
			
//			@Override
//			public String toString() {
//				return "Employeegc [empname=" + empname + ", salary=" + salary + "]";
//			}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "empname"+empname;
		}
		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return super.hashCode();
		}
			public static void main(String[] args) {
				Employeegc t = new Employeegc();
				
				t.empname = "mounika";
				t.salary = 60000;
				System.out.println("Name of the Employee :" + t.empname);
				System.out.println("salary:" + t.salary);
				

				Employee s = new Employee();
			
				s.empname = "dhana";
				s.salary = 80000;
				System.out.println("Name of the Employee :" + s.empname);
				System.out.println("salary:" + s.salary);
			
			
				t = null;
				System.gc();
				System.out.println(t);
				System.out.println(s);
				}
			}


