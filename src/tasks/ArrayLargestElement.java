package tasks;

import java.util.Scanner;

public class ArrayLargestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("enter the 5 elements");
		//int [] arr = new int[5];
		//if we declare the values in the program
		int [] arr = {12,45,7,89,23};
		
		//if we does not give numbers in the programs
		//for(int i =0;i<arr.length;i++) {
		//arr[i] = sc.nextInt();
		//}
			int largestnum = arr[0];
			
			for (int i = 1;i<arr.length;i++) {
				if(arr[i]>largestnum) {
					largestnum = arr[i];
				}
		}
			System.out.println("Largest number is:" +largestnum);
			sc.close();
	}

}
