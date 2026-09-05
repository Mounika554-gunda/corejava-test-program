package javaoperators;

public class Bitwiseoperator {

	public static void main(String[] args) {
		
		System.out.println("Bitwise & operator....");
		System.out.println("-----------------------------------");
		System.out.println(true&true);
		System.out.println(true&false);
		System.out.println(false&true);
		System.out.println(false&false);
		
		System.out.println(1&1);
		System.out.println(1&0);
		System.out.println(0&1);
		System.out.println(0&0);
		
		System.out.println(671&55);
		System.out.println(86&39);
		System.out.println(91&47);
		System.out.println(88&66);
		
		System.out.println("-----------------------------------");
		System.out.println("Bitwise | operator....");
		System.out.println("-----------------------------------");
		System.out.println(true|true);
		System.out.println(true|false);
		System.out.println(false|true);
		System.out.println(false|false);
		
		System.out.println(1|1);
		System.out.println(1|0);
		System.out.println(0|1);
		System.out.println(0|0);
		
		System.out.println(67|55);
		System.out.println(86|39);
		System.out.println(91|47);
		System.out.println(88|66);

		System.out.println("-----------------------------------");
		System.out.println("Bitwise ^ operator....");
		System.out.println("-----------------------------------");
		System.out.println(true^true);
		System.out.println(true^false);
		System.out.println(false^true);
		System.out.println(false^false);
		
		System.out.println(1^1);
		System.out.println(1^0);
		System.out.println(0^1);
		System.out.println(0^0);
		
		System.out.println(67^55);
		System.out.println(86^39);
		System.out.println(91^47);
		System.out.println(88^66);
		
		System.out.println("-----------------------------------");
		System.out.println("Bitwise ~ operator....");
		System.out.println("-----------------------------------");
		 System.out.println(~10);//-(n+1)=11

	}

}
