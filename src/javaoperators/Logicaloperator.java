package javaoperators;

public class Logicaloperator {

	public static void main(String[] args) {
		int a = 100;
		int b = 150;
		int c = 10;
		//Logical &&
		
		System.out.println("logical && operator....");
		System.out.println("-----------------------------------");
		System.out.println(true&&true);
		System.out.println(true&&false);
		//System.out.println(false&&true);//dead code:first false is always dead code
		//System.out.println(false&&false);
		
		System.out.println(a<b&&b>c);
		System.out.println(a<b&&b<c);
		System.out.println(a>b&&b>c);
		System.out.println(a>b&&b<c);
		
		//Logical ||
		System.out.println("logical || operator....");
		System.out.println("-----------------------------------");
		//System.out.println(true||true);//Dead code
		//System.out.println(true||false);//dead code:first true is always dead code
		System.out.println(false||true);
		System.out.println(false||false);
		
		System.out.println(a<b||b>c);
		System.out.println(a<b||b<c);
		System.out.println(a>b||b>c);
		System.out.println(a>b||b<c);
		
		int x = 20;
		int y = 30;
	
		System.out.println(++x <++y ||++x <++y);
		System.out.println("x value:" +x);
		System.out.println("y value:" +y);
		
		System.out.println(++x > ++y ||++x > ++y);
		System.out.println("x value:" +x);
		System.out.println("y value:" +y);

	}

}
