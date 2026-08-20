package javalogicalstatements;

import java.util.Scanner;

public class Ifelseif {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        num = Math.abs(num);

        if (num >= 10 && num <= 99) {
            System.out.println("Two-Digit Number");
        } 
        else if (num >= 100 && num <= 999) {
            System.out.println("Three-Digit Number");
        } 
        else if (num >= 1000 && num <=9999) {
            System.out.println("Four-Digits Number");
        } 
        else if (num >=10000) {
        	System.out.println("More than four digit number");
        }
        else {
            System.out.println("Less Than Two Digits");
        }

        sc.close();

	}

}
