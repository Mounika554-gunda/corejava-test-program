package myfirstjavaproject;

public class Employee {

			String empname;
			int salary;
			
			static String compname ="TCS";
			static String location ="hyd";
			

			public static void main(String[] args) {
				System.out.println("Employee details....");
				System.out.println("---------------------------------------------");
				Employee t = new Employee();
				t.empname = "mounika";
				t.salary = 60000;
				System.out.println("Name of the Employee :" + t.empname);
				System.out.println("salary:" + t.salary);
				System.out.println("Name of the company:" +compname);
				System.out.println("location:" +location);
				System.out.println("---------------------------------------------");
				
				
			     compname = "VSS";
			     location = "chennai";
			     
				
				Employee s = new Employee();
				s.empname = "dhana";
				s.salary = 80000;
				System.out.println("Name of the Employee :" + s.empname);
				System.out.println("salary:" + s.salary);
				System.out.println("Name of the company:" +compname);
				System.out.println("location:" +location);
				}
			}
