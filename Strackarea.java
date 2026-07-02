package myfirstjavaproject;

public class Strackarea {

	

			public static void main(String[] args) {
				System.out.println("main method started");
				method1();
				
				}

				static void method1() {
					 method2();
				System.out.println(" hello method1");
				
			}
				static void method2() {
					Strackarea t = new Strackarea();
					t.method3();
					System.out.println(" hello method2");
					
				}
				void method3() {
					method4();
					System.out.println(" hello method3");
					
				}
				void method4() {
					System.out.println(" hello method4");
					
				}
			

	
	}

