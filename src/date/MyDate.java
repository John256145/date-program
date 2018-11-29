package date;

public class MyDate {
	
	
	public MyDate() {

		year = 0;
		month = 0;
		day = 0;
	}
	
	//this tells MyDate to look for 3 int variables
	public MyDate(int x, int y, int z) {

		year = x;
		month = y;
		day = z;
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
	public void setYear(int x) {
		year = x;
	}
	
	public void setMonth(int y) {
		month = y;
	}
	
	public void setDay(int z) {
		year = z;
	}
	
	public String getBasicFormat (){
		String BasicFormat = year + "-" + month + "-" + day  ;
		
		return BasicFormat ;
	}
	
	
	
	
	//just to make sure everything is working
	// test x and test y will need both a setter and getter
	private int testx , testy;
	
	public int testmath (){
		int testTotal ;
		testTotal = testx * testy ;
		return testTotal ;
	}
	
	
	public int gettestx (){
		return testx ;
		}
	
	public int gettesty (){
		return testy ;
		}
	
	
	
	public void settestx ( int theX ){
		testx = theX ;
		}
	
	public void settesty ( int theY ){
		testy = theY ;
		}
	
	
}
