package date;

public class MyDateLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyDate d1 = new MyDate(2011, 12, 28);
		
		for (int i = 0; i < 66; i++) {
			System.out.println(d1);
			System.out.println(d1.nextDay());
		}
			
		
		
		
		
		
	}

}
