package javalogicalstatements;

import java.util.Scanner;

public class Elseifcondition {
	
	String gradeinfo(double marksp) {
		String grade = "";
		
		if (marksp>100||marksp<0) {
			System.out.println("invalid");
		}
		else if(marksp >=90){
			grade = "Excellent-A";
		}
		else if(marksp >=80){
			grade = "Good-B";
		}
		else if(marksp >=70){
			grade = "Average-C";
		}
		else if(marksp >=60){
			grade = "Ok-D";
		}
		else if(marksp >=35){
			grade = "Just passed:p";
		}
		
		return grade;
	}
	
	 void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks percentage % : ");
		double marksp = sc.nextDouble();
		
		String grade = gradeinfo(marksp);
		System.out.println("Student grade based on his marks p :"  +grade);
		
		sc.close();
	
	}

}
