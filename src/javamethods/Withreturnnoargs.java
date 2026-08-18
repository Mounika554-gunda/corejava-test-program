package javamethods;

import java.util.Scanner;

public class Withreturnnoargs {
	double salary;
	double bonus;
	double getsalary() {
		double sal=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter salary:");
		sal = sc.nextDouble();
		
		return sal;
		
	}
	double getbonus() {
		double bonus = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter bonus:");
		bonus = sc.nextDouble();
		sc.close();
		return bonus;
	}

	public static void main(String[] args) {
		Withreturnnoargs r = new Withreturnnoargs();
	
		double s = r.getsalary();
		double b = r.getbonus();
		
		System.out.println("total salary :" +(b+s));
		
		
	}
}
