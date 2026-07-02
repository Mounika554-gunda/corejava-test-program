package myfirstjavaproject;

public class Static {

	
		
			static {
				System.out.println("static block1 loaded");
				Static t = new Static();
				
			}

			public static void main(String[] args) {
				System.out.println("main method started !!");
				Static t = new Static();
				
			}
			{
				System.out.println("instance block1 loaded");
			}
			{
				System.out.println("instance block2 loaded");
			}
			static {
				System.out.println("static block1 loaded");
				
				
			}
			
			


	}


