package constructors;

import java.util.Scanner;

public class Crickerplayers {
	
	String ply_name;
	int plyed_matches;
	int runs;
	
	Crickerplayers(){
		
	}
	Crickerplayers(String ply_name, int plyed_matches, int runs) {
		this.ply_name = ply_name;
		this.plyed_matches = plyed_matches;
		this.runs = runs;
	}
	void plyinfo() {
		
		double Averageruns = (double)runs/plyed_matches;
		
		System.out.println("Name of the player:"+ply_name);
		System.out.println("Number of the matches:"+plyed_matches);
		System.out.println("Number of the runs:"+runs);
		System.out.println(" Average runs:"+Averageruns);
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("name of the player:");
		String ply_name =sc.nextLine();
		
		System.out.println("Number of the matches:");
		int plyed_matches = sc.nextInt();
		
		System.out.println("Number of the runs:");
		int runs = sc.nextInt();
		
		Crickerplayers c1 = new Crickerplayers(ply_name,plyed_matches,runs);
		c1.plyinfo();
		
		sc.close();
		}
}
