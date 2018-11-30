package date;

public class MyDate {
	
	
	public MyDate() {

		year = 0;
		month = 0;
		day = 0;
		
		
		
	}
	
	//this tells MyDate to look for 3 int variables
	// then it checks if the 3 variables are a valid date
	
	public MyDate(int x, int y, int z) {
		
		if ( isValidDate(x , y, z) == true ) {
			year = setYear(x);
			month = setMonth(y);
			day = setDay(z);
			String month = strMonths[y - 1];
			System.out.println(day + " " + month + " " + year);
		}else {
			System.out.println("Invalid date!");
		}
		
		
		
//		System.out.println(isLeapYear(x));
}
	
	//year = x
	//month = y
	//day = z
	
	
	private int year, month, day;
	private static String [] strMonths = {"Jan" , "Feb", "Mar", "April", "May" ,"Jun" , "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
	private static String [] strDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", };
	private static int daysInMonths [] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	//getters
	public int getYear (){
		return year ;
		}
	
	public int getMonth (){
		return month ;
		}
	
	public int getDay (){
		return day ;
		}
	
	// end of getters
	
	//setters
	public int setYear(int x) {
		
//		if (x > 0 && x < 10000) {
//			year = x;
//			return year;
//		}else {
//			year = 0;
//			return year;
//		}
		
		year = x;
		return year;
		
	}
	
	public int setMonth(int y) {
//		if (y > 0 && y < 13) {
//			month = y;
//			return month;
//		}else {
//			month = 0;
//			return month;
//		}
		month = y;
		return month;
	}
	
	public int setDay(int z) {
		day = z;
		return day;
	}
	// end of setters
	
	
	
	public String getBasicFormat (){
		String BasicFormat = day + " " + month + " " + year  ;
		
		return BasicFormat ;
	}
	
	public static boolean isLeapYear (int x){
		if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isValidDate (int x, int y, int z){
		if ( (x > 0 && x < 10000) &&
				(y > 0 && y < 13) &&
				(z > 0 && z < 32)) {
			
			return true;
		}else {
			return false;
		}
	}
	
	
	

	
}
