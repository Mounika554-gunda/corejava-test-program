package myfirstjavaproject;

public class Student {

	
//			instance data
			int sid = 4246;
			String sname = "mouni";
//			static data
			static int collegeid = 45678;
			static String collegename = "abcd";
			
			
			public static void main(String[] args) {
				
				collegeid = 6578;
				collegename = "xyz";
				
				System.out.println("college ID:" +collegeid);
				System.out.println("college name:" +collegename);
				
			
				Student mouni = new Student();
				mouni.sid  = 345678;
				mouni.sname = "mounika";
				System.out.println("student ID:" +mouni.sid);
				System.out.println("student name:" +mouni.sname);
			
			}

		
	}


