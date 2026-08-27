package constructors;

public class Copyconstructor {
	String model;
	String brand;
	double price;
	
	//Laptop
	
	Copyconstructor(){
		System.out.println("no arg constructor");
	}
	
	Copyconstructor(Copyconstructor c){
		System.out.println("parameterized constructor ");
		this.model = c.model;
		this.brand = c.brand;
		this.price = c.price;
	}
	
	void lapinfo(){
		System.out.println("---------------------------------");
		System.out.println("Model of the Laptop:" +model);
		System.out.println("Brand of the Laptop:" +brand);
		System.out.println("Price of the Laptop:" +price);
		System.out.println("---------------------------------");
	}
	public static void main(String[] args) {
		Copyconstructor c = new Copyconstructor();
		c.model ="intel";
		c.brand = "dell";
		c.price = 80000;
		c.lapinfo();
		
		Copyconstructor c1 = new Copyconstructor(c);
		c1.lapinfo();
		
		

	}

}
