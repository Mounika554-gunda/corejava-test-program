package javaLiterals;

public class IntegerLiterals {
	     //decimal literals
			int a1 = 123;
			int a2 = 789;
			
			
			//octal literals
			int a3 = 0123;
			int a4 = 0456;
			int a5 = 0765;
			//int a6 = 0876;
			//The literal 0876 of type int is out of range 
			
			
			//hexa-decimal literals
			int a6 = 0x123;
			int a7 = 0x456;
			int a8 = 0x567;
			int a9 = 0xa1b2;
			int a10 = 0xfaa;
			int a11 = 0xDAD;
			int a12 = 0xBCE;
			//int a13 = 0xbeer;
			//syntax error on token "r", delete this token
			
			
			//Binary literals
			int a13 = 0b101010;
			int a14 = 0b1101;
			int a15 = 0B1111;
			int a16 = 0B0001;

	public static void main(String[] args) {
		IntegerLiterals i = new IntegerLiterals();
		
		System.out.println(i.a1);
		System.out.println(i.a2);
		System.out.println(i.a3);
		System.out.println(i.a4);
		System.out.println(i.a5);
		System.out.println(i.a6);
		System.out.println(i.a7);
		System.out.println(i.a8);
		System.out.println(i.a9);
		System.out.println(i.a10);
		System.out.println(i.a11);
		System.out.println(i.a12);
		System.out.println(i.a13);
		System.out.println(i.a14);
		System.out.println(i.a15);
		System.out.println(i.a16);
		
	}

}
