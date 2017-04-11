package edu.buffalostate.cis425.sp16.exercises.kuntz;

public class Triangle {

	private int S1, S2, S3;

	public Triangle ( ) {
		S1 = 0;
		S2 = 0;
		S3= 0;
	}

	public Triangle ( int s1, int s2, int s3 ) {
		S1 = s1;
		S2 = s2;
		S3 = s3;
	}

	public int calculatePerimeter( ) {
		int perimeter;
		perimeter = S1+S2+S3;
		return perimeter;
	}

	public static void main( String args[] ) {
		Triangle t = new Triangle(10, 5, 2);
		System.out.println("The perimeter of t is: " + t.calculatePerimeter() );
	}
}