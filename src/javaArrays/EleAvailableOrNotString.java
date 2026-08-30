package javaArrays;

import java.util.Scanner;

public class EleAvailableOrNotString {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String [] arr = {"ruturaj","dhoni","rahul","jaddu","sanju","pant"};
		System.out.println("Enter a player name:");
		
		String search = sc.next();
		boolean status = false;
		
		for(String s:arr) {
			if(s.equals(search)) {
				System.out.println("Player found He is in the Team");
				status = true;
				break;
			}
		}
		if(!status) {
			System.out.println("player not found !! may be He is not in the Team");
		}
		sc.close();

	}

}
