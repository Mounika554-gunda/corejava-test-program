package tasks;

import java.util.Scanner;

public class ArraySmallestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int [] a = {45,78,23,97,6,15,54};
		
		int smallestnum = a[0];
		
		for (int i = 0;i<a.length;i++) {
			if(a[i]<smallestnum) {
				smallestnum = a[i];
			}
		}
		System.out.println("Smallest Number is : " +smallestnum);
		sc.close();
	}

}
