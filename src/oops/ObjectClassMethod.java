package oops;

public class ObjectClassMethod {
	
	
//	finalize method
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize mehod called");
	}
	
//	override tostring method
	
	@Override
		public String toString() {
			return "Employee info [ID: " +id+" ,Name:" +name; 
		}
	
	int id =7;
	String name = "Dhoni";
	
	ObjectClassMethod(){
		
	}
	
//	getclass method
	void show() {
		System.out.println("show method called" +this.getClass());
	}

	public static void main(String[] args) {
		

		ObjectClassMethod t1 = new ObjectClassMethod();
		System.out.println(t1);
		
		ObjectClassMethod t2 = new ObjectClassMethod();
		System.out.println(t2);
		
		ObjectClassMethod t3 = new ObjectClassMethod();
		t3 = t2;
		
		
		//hash code method
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println("--------------------------");
		//show method called
		t1.show();
		System.out.println("----------------------------");
		
//		tostring method
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println("------------------------------------");
		
//		garbage method calling
		System.gc();
		//Equals method
		System.out.println(t1.equals(t2));
		System.out.println(t2.equals(t3));
		//== Operator
		System.out.println(t2==t3);
		
		System.out.println("--------------------------------");
	}

}
