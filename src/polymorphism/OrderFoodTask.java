package polymorphism;

interface FoodOrder {
	void prepareFood();
}

class OrderDetails implements FoodOrder {
	int orderId;
	String CustName;
	double price;

	OrderDetails() {

	}

	public OrderDetails(int orderId, String CustName, double price) {
		this.orderId = orderId;
		this.CustName = CustName;
		this.price = price;
	}

	void displayDetails() {
		System.out.println("Order Id:" + orderId);
		System.out.println("Customer Name:" + CustName);
		System.out.println("Price of the Order:" + price);
	}

	@Override
	public void prepareFood() {
		System.out.println("prepare Food........");

	}
}

class PizzaOrder extends OrderDetails implements FoodOrder {

	public PizzaOrder(int orderId, String CustName, double price) {
		super(orderId, CustName, price);
	}

//		if there is interface we did not use displayDetails()
//		@Override
//		void displayDetails() {
//			System.out.println("Pizza Orders.........");
//			System.out.println("Order Id:" + orderId);
//			System.out.println("Customer Name:" + CustName);
//			System.out.println("Price of the Order:" + price);
//		}

}

class BurgerOrder extends OrderDetails implements FoodOrder {

	public BurgerOrder(int orderId, String CustName, double price) {
		super(orderId, CustName, price);
	}

//		@Override
//		void displayDetails() {
//			System.out.println("Burger Orders.......");
//			System.out.println("Order Id:" + orderId);
//			System.out.println("Customer Name:" + CustName);
//			System.out.println("Price of the Order:" + price);
//		}
}

public class OrderFoodTask {

	void main(String[] args) {

		OrderDetails Order = new OrderDetails();
		Order.prepareFood();
		System.out.println("-----------------------------------------");

		Order = new PizzaOrder(101, "Mounika", 220);
		Order.displayDetails();

		System.out.println("-----------------------------------------");

		Order = new BurgerOrder(102, "Chinnu", 250);
		Order.displayDetails();
	}
}