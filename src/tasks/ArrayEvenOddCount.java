package tasks;

import java.util.Scanner;

public class ArrayEvenOddCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] a= {23,89,56,54,12,65,43,82,98};
		
		int evencount = 0;
		int oddcount = 0;
		
		for (int i = 0;i<a.length;i++) {
			if (a[i]%2 ==0) {
				evencount ++;
			}else {
				oddcount++;
			}
		}
		System.out.println("Count of Even numbers is :" +evencount);
		System.out.println("Count of odd numbers is :" +oddcount);
		sc.close();
	}

}
