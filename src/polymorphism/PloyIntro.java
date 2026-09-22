package polymorphism;

public class PloyIntro {

	public static void main(String[] args) {
//		String
		System.out.println("Main Method");
		
		
//		Auto-Promotion Or Auto-Boxing
		byte b = 10;
		System.out.println(b);
		
//		Auto-Unboxing
		Integer i = 100;
		System.out.println(i);
	
		PloyIntro p = new PloyIntro();
//		object
		System.out.println(p);
		
//		int,long,Float,Double,Char,boolean
		System.out.println(100);
		System.out.println(234567954321367L);
		System.out.println(56.67F);
		System.out.println(75.5D);
		System.out.println('c');
		System.out.println(false);
		
		char[] ch = {'a','b','c'};
		System.out.println(ch);
	}
}
