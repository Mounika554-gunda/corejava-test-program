package javamethods;
import java.util.Scanner;


public class Noreturnwithargs {
	int age;
	String name;
	double salary;
	float heigth;
	char gender;
	
	void getname(String name) {
		System.out.println("Employee name:" +name);
	}
	void getage(int age) {
		System.out.println("Employee age:" +age);
	}
	void salary(double salary) {
		System.out.println("Employee salary:" +salary);
	}
	void heigth(float heigth) {
		System.out.println("Employee heigth:" +heigth);
	}
	void gender(char gender) {
		System.out.println("Employee gender:" +gender);
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		
		
		sc.nextLine();
		System.out.println("Enter your Name:");
		String name = sc.nextLine();
		
		System.out.println("Enter your salary:");
		double sal = sc.nextDouble();
		
		System.out.println("Enter your heigth:");
		float heigth = sc.nextFloat();
		
		System.out.println("Enter your Gender:");
		char gender = sc.next().charAt(0);
		
//		System.out.println("Employee name:" +name);
//		System.out.println("Employee age:" +age);
//		System.out.println("Employee salary:" +sal);
//		System.out.println("Employee height:" +height);
//		System.out.println("Employee gender:" +gender);
		
		//method calling
		Noreturnwithargs n = new Noreturnwithargs();
		
		n.getage(age);
		n.getname(name);
		n.salary(sal);
		n.heigth(heigth);
		n.gender(gender);

		sc.close();
	}

}
