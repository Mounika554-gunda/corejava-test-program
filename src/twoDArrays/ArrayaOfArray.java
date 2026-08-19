package twoDArrays;
//Jagged arrays

public class ArrayaOfArray {

	public static void main(String[] args) {
		int [][] arr = new int [3][1];
		
		arr[0] = new int[3];
		arr[1]= new int [4];
		
		arr[0][0] = 101;
		arr[0][1] = 102;
		arr[0][2] = 103;
		
		
		arr[1][0] = 105;
		arr[1][1] = 106;
		arr[1][2] = 107;
		//arr[1][3] = 108;
		//If we not give any value default it will take 0
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
