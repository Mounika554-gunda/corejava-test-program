package myfirstjavaproject;

public class Objectcount {
	static int objectcount;
	{
		objectcount++;
				
				
	}
	public static void main(String[] args) {
		Objectcount a = new Objectcount();
		Objectcount b = new Objectcount();
		Objectcount c = new Objectcount();
		Objectcount d = new Objectcount();
		System.out.println("Object count:" +objectcount);
		}
		
	}

