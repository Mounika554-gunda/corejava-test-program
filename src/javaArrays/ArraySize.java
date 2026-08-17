package javaArrays;

import java.util.Scanner;

public class ArraySize {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];
		//System.out.println(numbers);//Address of the number class
		System.out.println("Enter the Elements:");
		for(int i = 0;i<5;i++) {
			numbers[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			if(numbers[i]%2==0) {
				System.out.println(numbers[i]);
			}
		}
		sc.close();

	}

}
