package date;

public class MyDate {
	private int year, month, day;
	private String [] strMonths = {"Jan" , "Feb", "Mar", "April", "May" ,"Jun" , "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
	private String [] strDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", };
	private int daysInMonths [] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	
	
	
	
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
