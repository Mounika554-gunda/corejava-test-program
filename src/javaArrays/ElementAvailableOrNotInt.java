package javaArrays;

import java.util.Scanner;

public class ElementAvailableOrNotInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int[] arr = {31,7,45,1,10,33,9,8};
		System.out.println("Enter a Number:");
		
		int search = sc.nextInt();
		boolean status = false;
		
		for(int a:arr) {
			if(a==search) {
				System.out.println("The Element is Found ");
				status = true;
				break;
			}
		}

		if(!status) {
			System.out.println("Element not Found");
		}
		sc.close();
	}

}
