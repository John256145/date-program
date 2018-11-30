package date;

public class MyDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyDate d1 = new MyDate(2012, 3, 30);
		
		System.out.println(d1);
		System.out.println(d1.nextDay());
		System.out.println(d1);
		System.out.println(d1.nextMonth());
		System.out.println(d1);
		System.out.println(d1.nextYear());
		System.out.println(d1);
		System.out.println(d1.previousDay());
		System.out.println(d1);

		
		//d1.setDate(2110, 12, 30);
		//This will replace the current date with a new specified date
		
//		System.out.println(d1.toString());
		
		
		
//		System.out.println(d1.getBasicFormat());
		

	}

}
