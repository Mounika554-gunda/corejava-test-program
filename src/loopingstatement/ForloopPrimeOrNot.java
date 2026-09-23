package loopingstatement;

import java.util.Scanner;

public class ForloopPrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		boolean prime = true;
		
		sc.close();
		if (n<=1) {
			prime = false;
			
		}else {
			for(int i = 2;i<n;i++) {
				if (n%i==0) {
					prime = false;
					break;
				}
			}
		}
		if(prime) {
			System.out.println(n + " is a prime number");
		}else {
			System.out.println(n + "is not a prime number");
		}
	}
}

