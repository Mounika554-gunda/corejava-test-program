package loopingstatement;

import java.util.Scanner;

public class Armstrongnumberfor3num {
	static boolean isarmstrong(int n) {
		boolean status = false;
		int temp=n;
		int r = 0;
		int sump =0;
		
		while (n>0) {
			r=n%10;
			n=n/10;
			sump = sump+r*r*r;
		}
		if(sump==temp){
			status =true;
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		
		boolean status = isarmstrong(n);
		if (status) {
			System.out.println("The given number is a Armstrong ");
		}else {
			System.out.println("The given number is not a Armstrong");
		}
		sc.close();

	}

}
