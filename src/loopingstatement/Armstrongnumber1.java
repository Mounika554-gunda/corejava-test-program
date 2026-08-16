package loopingstatement;

import java.util.Scanner;

public class Armstrongnumber1 {
	
	static boolean isarmstrong(int n) {
		boolean status = false;
		int temp=n;
		int n1=n;
		int r = 0;
		int sump =0;
		int digitcount=0;
		
		while (n>0) {
			n=n/10;
			 digitcount++;
		}
		while(n1>0) {
			r =n1%10;
			n1= n1/10;
			sump = sump+Math.powExact(r, digitcount);
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
		System.out.println(status);
		if (isarmstrong(n)) {
			System.out.println("The given number is a Armstrong ");
		}else {
			System.out.println("The given number is not a Armstrong");
		}
		sc.close();
	}

}
