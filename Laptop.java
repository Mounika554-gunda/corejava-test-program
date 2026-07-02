package myfirstjavaproject;

public class Laptop {

	
			@Override
			protected void finalize() throws Throwable {
				System.out.println("object destroy");
			}

			public static void main(String[] args) {
				Laptop dell = new Laptop();
				System.out.println(dell);
				Laptop len = new Laptop();
				System.out.println(len);
				Laptop as = new Laptop();
				System.out.println(as);
				
				
				
				dell = null;
				len = null;
				System.gc();
				System.out.println(dell);
				System.out.println(len);
				System.out.println(as);
				int a = 0x2b2fa4f7;
				System.out.println(a);
				int b = 0x1dbd16a6;
				System.out.println(b);
				}
			}


