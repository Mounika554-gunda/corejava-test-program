package javamethods;

import java.util.Scanner;

public class Areasofmany {
	//Rectangle
	//formula = length*breadth
	double findareaofrectangle(double length,double breadth) {
		double arearec = length*breadth;
		return arearec;
	}
	
	//Triangle
	//formula = 0.5*base*height
	//float can convert into double-->implicit type casting
	double findareaoftriangle(float base,float height) {
		double areatri =  0.5*base*height;
		return areatri;
	}

	
	//square
	//formula = side*side
	//to convert int into double we write int inside the return-->explicit 
	int findareaofsquare(double side) {
		double areasq = side*side;
		return(int) areasq;
	}
	
	//circle
	//formula = pi*r*r
	double findareaofcircle(double radius) {
		double areacir = Math.PI*radius*radius;
		return areacir;
	}
	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//rectangle
		System.out.println("Enter length:");
		double l = sc.nextDouble();
		System.out.println("Enter breadth:");
		double b = sc.nextDouble();
		double arearec = findareaofrectangle(l,b);
		System.out.println("Area of the Rectangle :" +arearec);
		
		//triangle
		System.out.println("Enter the base:");
		float ba = sc.nextFloat();
		System.out.println("Enter the Height:");
		float h = sc.nextFloat();
		double areatri = findareaoftriangle(ba,h);
		System.out.println("Area of the Triangle:" +areatri);
		
		//Square
		System.out.println("Enter the side :");
		int s = sc.nextInt();
		double areasq = findareaofsquare(s);
		System.out.println("Area of the Square:" +areasq);
		
		//Circle
		System.out.println("Enter radius:");
		double r = sc.nextDouble();
		double areacir = findareaofcircle(r);
		System.out.println("Area of the Circle:" +areacir);
		sc.close();

	}

}
