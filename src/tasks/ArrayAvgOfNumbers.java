package tasks;

import java.util.Scanner;

public class ArrayAvgOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//int[] arr = new int [5]; Or
		int [] arr = {54,89,62,49,75};
		int sum = 0;
		
		//System.out.println("enter 5 elements:");
		
		for(int i=0;i<arr.length;i++) {
			//arr[i]= sc.nextInt();
			sum= sum +arr[i];
		}
		double avg = (double) sum/arr.length;
		System.out.println("avg = " +avg);
		sc.close();

	}

}
