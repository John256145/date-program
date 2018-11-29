package date;

public class MyDate {
	
	
	public MyDate() {

		year = 0;
		month = 0;
		day = 0;
	}
	
	//this tells MyDate to look for 3 int variables
	public MyDate(int x, int y, int z) {
		
		year = setYear(x);
		month = setMonth(y);
		day = setDay(z);
		String month = strMonths[y - 1];
		System.out.println(day + " " + month + " " + year);
//		System.out.println(isLeapYear(x));
}
	
	
	private int year, month, day;
	private String [] strMonths = {"Jan" , "Feb", "Mar", "April", "May" ,"Jun" , "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
	private String [] strDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", };
	private int daysInMonths [] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
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
	
	
	
	//setters
	public int setYear(int x) {
		if (x > 0 && x < 10000) {
			year = x;
			return year;
		}else {
			year = 0;
			return year;
		}
		
		
	}
	
	public int setMonth(int y) {
		month = y;
		return month;
	}
	
	public int setDay(int z) {
		day = z;
		return day;
	}
	
	public String getBasicFormat (){
		String BasicFormat = day + " " + month + " " + year  ;
		
		return BasicFormat ;
	}
	
	public boolean isLeapYear (int x){
		if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0)) {
			return true;
		}else {
			return false;
		}
		
	
	}
	
	
	//just to make sure everything is working
	// test x and test y will need both a setter and getter
//	private int testx , testy;
//	
//	public int testmath (){
//		int testTotal ;
//		testTotal = testx * testy ;
//		return testTotal ;
//	}
//	
//	
//	public int gettestx (){
//		return testx ;
//		}
//	
//	public int gettesty (){
//		return testy ;
//		}
//	
//	
//	
//	public void settestx ( int theX ){
//		testx = theX ;
//		}
//	
//	public void settesty ( int theY ){
//		testy = theY ;
//		}
//	
	
}
