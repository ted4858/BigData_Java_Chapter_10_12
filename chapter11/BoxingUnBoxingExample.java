package chapter11;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		//Boxing
		Integer obj1 = 100;
		Integer obj2 = 200;
		Integer obj3 = 300;
		
		//UnBoxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}
}
