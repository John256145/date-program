package circle;

public class Circle {
	public static final double pi = 3.14159;

	public Circle() {

		radius = 0.0;
	}

	public Circle(double r) {

			radius = r;
	}
		
		private double  radius;
		
		public double getDiameter (){
			double theDiameter ;
			theDiameter = radius * 2 ;
			return theDiameter ;
		}
		
		
		public double getCircumference (){
			double theCircumference ;
			theCircumference = 2 * pi * radius ;
			return theCircumference ;
		}
		
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
