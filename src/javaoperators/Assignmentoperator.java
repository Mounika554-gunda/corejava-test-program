package javaoperators;

public class Assignmentoperator {

	public static void main(String[] args) {
		int result = 10;
		System.out.println(result);
		result = result +5;
		System.out.println("+5 result:" +result);
		//result = result +5.5;
		//C.E:double cannot convert to int 
		result +=5.5;
		System.out.println("+5.5 result:" +result);
		result -=4.5;
		System.out.println("-4.5 result:" +result);
		result *=4.3;
		System.out.println("*4.3 result:" +result);
		result /=4.2;
		System.out.println("/4.2 result:" +result);
		result %=2.5;
		System.out.println("%2.5 result:" +result);
	}

}
