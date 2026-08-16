package loopingstatement;

import java.util.Scanner;

public class ArmstrongNumber {
	static boolean isarmstrong(int n) {
		boolean status = false;
		int temp=n;
		int r = 0;
		int sump =0;
		
		String digit = Integer.toString(n);
		int digitcount = digit.length();
		
		
		while (n>0) {
			r=n%10;
			n=n/10;
			sump = (int) (sump+Math.pow(r, digitcount));
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
