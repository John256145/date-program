package date;

public class MyDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyDate d1 = new MyDate(2012, 2, 28);
		
		System.out.println(d1.toString());
		System.out.println(d1.nextYear());
		System.out.println(d1.toString());
		d1.setDate(2110, 12, 30);
		System.out.println(d1.toString());
		d1.setDate(2110, 13, 30);
		System.out.println(d1.toString());

		
		
//		System.out.println(d1.getBasicFormat());
		

	}

}
