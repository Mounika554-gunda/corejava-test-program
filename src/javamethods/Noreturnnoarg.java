package javamethods;

public class Noreturnnoarg {
	void addition() {
		int a = 100;
		int b = 200;
		int sum = a+b;
		System.out.println(sum);
	}
	void sub() {
		int a = 700;
		int b = 500;
		int diff = a-b;
		System.out.println(diff);
	}

	void main() {
		System.out.println("Main method started");
		addition();
		sub();
		System.out.println("main method Ended");
		
		

	}

}
