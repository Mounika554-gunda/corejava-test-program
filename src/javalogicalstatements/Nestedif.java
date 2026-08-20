package javalogicalstatements;

import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		System.out.println("welcome to vcube matrimonal !!");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("what is your name:");
		String name = sc.nextLine();
		System.out.println("Nice to meet you Mr." +name);
		
		System.out.println("can you ads your assets values:");
		double assets = sc.nextDouble();
		
		System.out.println("what is your salary:");
		double salary = sc.nextDouble();
		
		if(assets>50000000.00||salary>2500000) {
			System.out.println("okey good to go");
			
			System.out.println("enter your age:");
			int age = sc.nextInt();
			
			if(age>=27&&age<=29) {
				System.out.println("lets continue...");
				
				System.out.println("enter your heigth:");
				double heigth = sc.nextDouble();
				
				System.out.println("enter your weigth:");
				double weigth = sc.nextDouble();
				
				if((heigth>=5.6 || heigth >=6.0) &&(weigth>=65 || weigth<=70)) {
					System.out.println("lets continue.....");
					
					System.out.println("Do you smoke or Drink:");
					boolean habstatus = sc.nextBoolean();
					
					if(!habstatus) {
						System.out.println("good continue the discusion....");
						
						System.out.println("Do you have Sliblings");
						boolean sibstatus =sc.nextBoolean();
						
						if(!sibstatus) {
							System.out.println("okey good !! we will meet back again");
						}else {
							System.out.println("OMG....!!");
						}
						
					}else {
						System.out.println("pakaki po inka...");
					}
				}else {
					System.out.println("you must join gym!!");
				}
			}else {
				System.out.println("sorry! you can leave ");
			}
			
		}else {
			System.out.println("you can leave for the day");
		}
		sc.close();

	}

}
