package date;

public class MyDate {
	
	private int year, month, day;
	private static String [] strMonths = {"Jan" , "Feb", "Mar", "Apr", "May" ,"Jun" , "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
	private static String [] strDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", };
	private static int daysInMonths [] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public MyDate() {

		year = 0;
		month = 0;
		day = 0;
		
		
		
		
	}
	
	//this tells MyDate to look for 3 int variables
	// then it checks if the 3 variables are a valid date
	
	public MyDate(int x, int y, int z) {
		
		if ( isValidDate(x , y, z) == true ) {
			setYear(x);
			setMonth(y);
			setDay(z);
			String month = strMonths[y - 1];
		}else {
			System.out.println("Invalid date!");
		}
		
		
		
//		System.out.println(isLeapYear(x));
}
	
	//year = x
	//month = y
	//day = z
	
	
	
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
	
	public int getDayOfWeek(int year, int month, int day) {

		double a = 0;
		double b = 0;
		double c = 0;
		int d = 0;
		int m = 0;
		double w = 0;
		
		if (month == 1 || month == 2) {
			a = year - 1;
		}else {
			a = year;
		}
		
		b = a % 100;
		c = a / 100;
		d = day;
		
		if (month == 1) {
			m = 11;
		}else if (month == 2) {
			m = 12;
		}else if (month == 3) {
			m = 1;
		}else if (month == 4) {
			m = 2;
		}else if (month == 5) {
			m = 3;
		}else if (month == 6) {
			m = 4;
		}else if (month == 7) {
			m = 5;
		}else if (month == 8) {
			m = 6;
		}else if (month == 9) {
			m = 7;
		}else if (month == 10) {
			m = 8;
		}else if (month == 11) {
			m = 9;
		}else {
			m = 10;}
		
		w = (d + (2.6 * m - 0.2) + b + (b/4) + (c/4) - 2 * c ) % 7;
		
		if (w < 0) {
			w += 7;
		}
		
		int v = (int)w;
		return v;
	}
	
	
	// end of getters
	
	//setters
	public void setDate(int x, int y, int z)
	{
		if(isValidDate(x, y, z))
		{
			year = x;
			month = y;
			day = z;
		}
		else
			System.out.println("Invalid date");
	}
	public void setYear(int x) {
		
//		if (x > 0 && x < 10000) {
//			year = x;
//			return year;
//		}else {
//			year = 0;
//			return year;
//		}
		
		year = x;
		
	}
	
	public void setMonth(int y) {
//		if (y > 0 && y < 13) {
//			month = y;
//			return month;
//		}else {
//			month = 0;
//			return month;
//		}
		month = y;
	}
	
	public void setDay(int z) {
		day = z;
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
				(z > 0 && z <= getDayMax(x,y) ) ) {	
			
			
			return true;
		}
		
		
		
		
		else {
			return false;
		}
	}
	
	public static int getDayMax(int year, int month)
	{
		String monthName = strMonths[month-1];
		int dayMax = 0;
		if(monthName.equals("Jan"))
		{
			dayMax = 31;
		}
		else if(monthName.equals("Feb"))
		{
			if(isLeapYear(year))
			{
				dayMax = 29;
			}
			else dayMax = 28;
		}
		else if(monthName.equals("Mar"))
		{
			dayMax = 31;
		}
		else if(monthName.equals("Apr"))
		{
			dayMax = 30;
		}
		else if(monthName.equals("May"))
		{
			dayMax = 31;
		}
		else if(monthName.equals("Jun"))
		{
			dayMax = 30;
		}
		else if(monthName.equals("Jul"))
		{
			dayMax = 31;
		}
		else if(monthName.equals("Aug"))
		{
			dayMax = 31;
		}
		else if(monthName.equals("Sep"))
		{
			dayMax = 30;
		}
		else if(monthName.equals("Oct"))
		{
			dayMax = 31;
		}
		else if(monthName.equals("Nov"))
		{
			dayMax = 30;
		}
		else
		{
			dayMax = 31;
		}
		
		return dayMax;
	}
	
	public int nextDay()
	{
		if(day == getDayMax(year, month) && month == 12)
		{
			day = 1;
			month = 1;
			year++;
		}
		else if(day == getDayMax(year, month))
		{
			day = 1;
			month ++;
		}
		else
			day++;
		
		if (day > getDayMax(year,month) ) {
			day = getDayMax(year,month);
		}
		
		return day;
	}
	
	public int nextMonth()
	{
		if(month == 12 && day == getDayMax(year, month))
		{
			month = 1;
			day = getDayMax(year, 1);
			year++;
		}
		else if(day == getDayMax(year, month))
		{
			day = getDayMax(year, month + 1);
			month++;
		}
		else
		{
			month++;
		}
		
		if (day > getDayMax(year,month) ) {
			day = getDayMax(year,month);
		}
		
		return month;
	}
	
	public int nextYear()
	{
		if(year == 9999)
		{
			System.out.println("Invalid year");
			return 0;
		}
		else if(day == getDayMax(year, month))
		{
			
			day = getDayMax(year + 1, month);
			year++;
		}
		else
		{
			year ++;
		}
		
		
		if (day > getDayMax(year,month) ) {
			day = getDayMax(year,month);
		}
		
		return year;
	}
	
	public int previousDay()
	{
		if(day == 1 && month == 1)
		{
			day = 31;
			month = 12;
			year--;
		}
		else if(day == 1)
		{
			day = getDayMax(year, month - 1);
			month--;
		}
		else
			day--;
		
		if (day > getDayMax(year,month) ) {
			day = getDayMax(year,month);
		}
		
		return day;
	}
	
	public int previousMonth()
	{
		if(month == 1)
		{
			month = 12;
			year--;
		}
		else
		{
			month--;
		}
		
		if (day > getDayMax(year,month) ) {
			day = getDayMax(year,month);
		}
		
		return month;
	}
	
	public int previousYear()
	{
		if(year == 1)
		{
			System.out.println("Invalid year");
			return 0;
		}
		else
		{
			year --;
		}
		
		if (day > getDayMax(year,month) ) {
			day = getDayMax(year,month);
		}
		
		
		return year;
	}
	
	
	
	
	/*
	public String getDayOfWeek(int year, int month, int day) 
	{
		String dayName = strDays[day-1];
		return dayName;
	}
	*/
	
	public String toString()
	{
		return strDays[getDayOfWeek(year, month, day)] + " " + day + " " + strMonths[month-1] + " " + year;
	}
	

	
}
