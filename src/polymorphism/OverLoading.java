package polymorphism;

public class OverLoading {

	 void main(String[] args) {
		hello("Mounika");
		hello(null);
	}
	
//		if both String and integer parameter are present hello(null) is getting error 
//	 because integer and string will return same so the system will confuse that which will execute so it will give error
//		error :The method hello(Integer) is ambiguous for the type OverLoading
	 
//	void hello(Integer i) {
//		System.out.println("Hello integer method called "+i);
//	}
	
	void hello(String name) {
		System.out.println("Hello String method Called "+name);
	}


	void hello(Object obj) {
		System.out.println("Hello Object method called " +obj);
	}
	
}
