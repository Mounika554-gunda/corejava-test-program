package javalogicalstatements;

import java.util.Scanner;

public class Ifelsecondition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Age:");
		int age = sc.nextInt();
		if(age>18) {
			System.out.println("you are eligiable for voting");
		}
		else {
			System.out.println("Babu niku inka time vundhi ra chinna");
		}
		sc.close();
	}

}
