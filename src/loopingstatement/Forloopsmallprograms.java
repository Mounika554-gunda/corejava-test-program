package loopingstatement;

public class Forloopsmallprograms {

	public static void main(String[] args) {
		
		System.out.println("********int************");
		for(int a =0 ;a<5; a++) {
			System.out.print( a + " ");
			
		}
		
		System.out.println(" ");
		System.out.println("********float************");
		for(float a =0; a<5; a=a+0.5F) {
			System.out.print(a + " ");
		}
		
		System.out.println(" ");
		System.out.println("********Reverse numbers************");
		for (int i = 10; i>=0; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println(" ");
		System.out.println("********Even numbers************");
		for (int i =0; i<=50; i++) {
			if(i%2==0) {
				System.out.print(i + " ");
				}	
		}
		
		System.out.println(" ");
		System.out.println("********Even numbers without zero************");
		for (int i =0; i<=50; i++) {
			if(i!=0&&i%2==0) {
				System.out.print(i + " ");
				}	
		}
		
		System.out.println(" ");
		System.out.println("********odd numbers************");
		for (int i =0 ; i<=50; i++) {
			if(i!=0&&i%2==1) {
				System.out.print(i + " ");
				}	
		}
		
	}

}
