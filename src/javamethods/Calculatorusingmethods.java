package javamethods;

import java.util.Scanner;

public class Calculatorusingmethods {
	void add(int a,int b){
		System.out.println("Addtion of two numbers:" +(a+b));
		}
	void sub(int a,int b){
		System.out.println("Subtration of two numbers:" +(a-b));
		}
	void multiply(int a,int b){
		System.out.println("multiply of two numbers:" +(a*b));
		}
	void divide(int a,int b){
		System.out.println("division of two numbers:" +(a/b));
		}
	

	void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second Number:");
		int num2 = sc.nextInt();
	
		
	     add(num1,num2);
	     sub(num1,num2);
	     multiply(num1,num2);
	     divide(num1,num2);
	     
	     sc.close();
	}

}
