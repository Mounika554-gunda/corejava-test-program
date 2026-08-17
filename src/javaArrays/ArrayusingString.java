package javaArrays;

public class ArrayusingString {

	public static void main(String[] args) {
		String[] names = new String[5];
		names[0]= "Dhoni";
		names[1]= "Ruturaj";
		names[2]= "Hardik";
		names[3]= "K L Rahul";
		//names[4]= "Virat";
		// If we don't give name for one array default it will take null
		
		
		//for loop
		//for (int i=0;i<names.length;i++) {
			//System.out.println(names[i]);
		//}
		//for each loop 
		for(String name:names) {
			System.out.println(name);
		}
		
		

	}

}
