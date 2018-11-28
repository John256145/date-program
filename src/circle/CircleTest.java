package circle;

import java.util.Scanner;
public class CircleTest {
	public static void main ( String [] args ){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the radius of a circle: ");
		
		 double userInput = scan . nextDouble ();
		
		Circle myCirc = new Circle (userInput);
		
//		myRect.setWidth(2.0);
//		myRect.setHeight(3.3);
		
		
		
		double myArea = myCirc.getArea();
		System.out.println ("Area is " + myArea );
		System.out.println ("Diameter is " + myCirc.getDiameter());
		System.out.println ("Circumference is " + myCirc.getCircumference());
}

}