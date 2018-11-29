package circle;

public class Circle {
	public static final double pi = 3.14159;

	public Circle() {

		radius = 0.0;
	}
	
	//this is what converts userInput (from Circle myCirc = new Circle (userInput);) to the radius
	
	public Circle(double r) {

			radius = r;
	}
		
		private double radius;
		
		// grabs radius value and calculates its diameter
		public double getDiameter (){
			double theDiameter ;
			theDiameter = radius * 2 ;
			return theDiameter ;
		}
		
		// grabs radius value and calculates its circumference
		public double getCircumference (){
			double theCircumference ;
			theCircumference = 2 * pi * radius ;
			return theCircumference ;
		}
		
		// grabs radius value and calculates its area
		public double getArea (){
			double theArea ;
			theArea = pi * radius * radius;
			return theArea ;
		}
		
		
		
		
		public double getRadius (){
			return radius ;
			}
		

		
		public void setRadius(double r) {
			radius = r;
		}
		
		
}
