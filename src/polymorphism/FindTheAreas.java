package polymorphism;

//Triangle=0.5*base*height
//square=side*side
//rectangle=length*breadth
//circle=pi*r*r

public class FindTheAreas {

	 void main(String[] args) {
		System.out.println("Area of Triangle:" +findarea(10.5,15.7));
		System.out.println("Area of square:" +findarea(55.5f));
		System.out.println("Area of rectangle:" +findarea(100,300));
		System.out.println("Area of circle:" +findarea(200D));
	}

//	 triangle
	 double findarea(double base,double height) {
		 return 0.5*base*height;
	 }
	 
//	 square
	 double findarea(float side) {
		 return side*side;
	 }
	 
//	 rectangle
	 double findarea(double l,float b) {
		 return l*b;
	 }
	 
//	 circle
	 double findarea(double r) {
		 return Math.PI*r*r;
	 }
}
