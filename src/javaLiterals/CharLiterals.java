package javaLiterals;

public class CharLiterals {
	char a1 = 'a';//single quote 
	char a2 = 'A';//ASCII
	char a3 = '\u0040';//uni-code 
	char a4 = 100;
	//ASCII more than 127 will consider as junk characters
	char a5 = 5678;
	char a6 = 125;
	char a7 = 'H';
	char a8 = 456;
	char a9 = 908;
	char a10 = 34565;
	

	public static void main(String[] args) {
		CharLiterals ch = new CharLiterals();
		System.out.println(ch.a1);
		System.out.println(ch.a2);
		System.out.println(ch.a3);
		System.out.println(ch.a4);
		System.out.println(ch.a5);
		System.out.println(ch.a6);
		System.out.println(ch.a7);
		System.out.println(ch.a8);
		System.out.println(ch.a9);
		System.out.println(ch.a10);
		
		

	}

}
