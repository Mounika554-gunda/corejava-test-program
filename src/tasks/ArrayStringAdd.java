package tasks;

import java.util.Scanner;

public class ArrayStringAdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		String [] arr = {"Everyone ","Want ","Job"};
		String sum=" ";
		
		for(String s:arr) {
			sum = sum+s;
		}
		System.out.println("sum :" +sum);
		sc.close();

	}

}
