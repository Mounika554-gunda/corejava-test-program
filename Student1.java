package myfirstjavaproject;

public class Student1 {

	int stdid;
	int age;
	String stdname;
	String address;
	
	
	void main() {
		System.out.println("student data....");
		System.out.println("1student..");
		System.out.println("-----------------------------");
		Student1 data = new Student1();
		stdid = 554;
		age = 21;
		stdname = "mouni";
		address = "sattenapalli";
		System.out.println("student id:" + stdid);
		System.out.println("student Age:"+ age);
		System.out.println("student name:" +stdname);
		System.out.println("student adress:" +address);
		
		System.out.println("2student...");
		System.out.println("--------------------------------");
		Student1 inf = new Student1();
		stdid = 514;
		age = 21;
		stdname = "farru";
		address = "sattenapalli";
		System.out.println("student id:" + stdid);
		System.out.println("student Age:"+ age);
		System.out.println("student name:" +stdname);
		System.out.println("student adress:" +address);
				
		System.out.println("3student...");
		System.out.println("--------------------------------");
		Student1 info = new Student1();
		stdid = 516;
		age = 21;
		stdname = "kodi";
		address = "nrt";
				System.out.println("student id:" + stdid);
				System.out.println("student Age:"+ age);
				System.out.println("student name:" +stdname);
				System.out.println("student adress:" +address);
				}

}
