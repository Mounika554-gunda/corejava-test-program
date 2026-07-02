package myfirstjavaproject;

public class Hello {

		public static void main(String[] args) throws ClassNotFoundException {
			System.out.println("Main class starting");
		    Class.forName("myfirstjavaproject.Hello1");
			Class.forName("java.lang.String");
			Class.forName("java.lang.System");
		    Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("main method ended");
		}

	}


