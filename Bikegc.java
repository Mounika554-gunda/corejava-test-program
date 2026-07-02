package myfirstjavaproject;

public class Bikegc {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("object destoryed");
	}
	void method1() {
		Bikegc s = new Bikegc();
				
	}
	
	public static void main(String[] args) {
		Bikegc f = new Bikegc();
		System.out.println(f);
		Bikegc g = new Bikegc();
		System.out.println(g);
		Bikegc m = new Bikegc();
		System.out.println(m);
		Bikegc h = new Bikegc();//object inside the method
		g = null;//nullifying
		h = f;//re-assign
		new Bikegc();//anonymous object
		
		System.gc();
		System.out.println(f);
		System.out.println(g);
		System.out.println(m);
	
	}

}
