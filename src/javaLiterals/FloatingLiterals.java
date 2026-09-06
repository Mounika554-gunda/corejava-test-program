package javaLiterals;

public class FloatingLiterals {
	//binary 
	float f = 10;
	float f1 = 10F;
	
	
	//octal to float
	//for float points octal does not work
	float f2 = 10.5F;
	float f3 = 10F;
	float f4 = 01234;
	
	
	//hexa-decimal
	float f5 = 0x1234;
	float f6 = 0x123F;
	//float f7 = 0x123.5F;
	//Invalid hex literal number,in this situation system gets confused that F is a hexa-decimal value or float
	
	
	//binary 
	float f7 = 0b01000;

	public static void main(String[] args) {
		FloatingLiterals t = new FloatingLiterals();
		
		System.out.println(t.f);
		System.out.println(t.f1);
		System.out.println(t.f2);
		System.out.println(t.f3);
		System.out.println(t.f4);
		System.out.println(t.f5);
		System.out.println(t.f6);
		
		

	}

}
