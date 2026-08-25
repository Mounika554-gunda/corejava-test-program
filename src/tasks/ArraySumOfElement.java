package tasks;

import java.util.Scanner;

public class ArraySumOfElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//if we want to give numbers in output we use below
		//int [] arr = new int[5]; Or
		//give numbers in input we use below 
		int [] arr = {10,20,30,40,50};
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			//if we want to give numbers in output we use below
			//arr[i] = sc.nextInt(); Or
			//give numbers in input we use below 
			sum =sum+arr[i];
		}
		System.out.println("sum :" +sum);
		sc.close();
	}

}
