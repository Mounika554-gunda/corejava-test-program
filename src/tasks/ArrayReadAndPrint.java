package tasks;

import java.util.Scanner;

public class ArrayReadAndPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 Elements:");
		int [] arr =new int[5];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Elements Are:");
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}

}
