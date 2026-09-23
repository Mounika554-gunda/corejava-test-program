package loopingstatement;

import java.util.Scanner;

public class ForloopTables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for which table do you want:");
		int n = sc.nextInt();
		
		System.out.println("how many times do you want...?:");
		int n1 = sc.nextInt();
		
		for (int i = 1;i<=n1;i++) {
			System.out.println(n + "X" + i + "=" +(n*i));
			sc.close();
		}

	}

}
