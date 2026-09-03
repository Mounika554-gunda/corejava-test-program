package loopingstatement;

public class ForloopEvenNumbers {
	static boolean evennum(){
		boolean status = false;
		
		for (int i=1;i<=50;i++ ) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}
		return status;
	}
	static boolean evennum50to100(){
		boolean status = false;
		
		for (int i=51;i<=100;i++ ) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}
		return status;
	}

	public static void main(String[] args) {
		evennum();
		System.out.println();
		evennum50to100();
	}

}

//for (int i=0;i<=100;i++ ) {
//if(i%2==0) {
//	System.out.print(i + " ");
//}
//}

