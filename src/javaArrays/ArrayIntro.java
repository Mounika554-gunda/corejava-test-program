package javaArrays;

public class ArrayIntro {

	public static void main(String[] args) {
		//step-1:declaration
		int [] ages;
		
		//step-2:Creation
		ages = new int [5];
		
		//step-3:Initialization
		ages[0]=21;
		ages[1]=20;
		ages[2]=17;
		ages[3]=18;
		ages[4]=22;
		
		//step-4: representation
		
		for(int i =0;i<ages.length;i++) {
			if(ages[i]>18) {
				System.out.print(i + " ");
				System.out.println(ages[i]);
				
				///for each loop
				/// for(int age : age){
				/// if(age>18){
				/// System.out.println(ages);
				/// }
			}
		}

	}

}
