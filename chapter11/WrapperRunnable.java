package chapter11;

public class WrapperRunnable {

	public static void main(String[] args) {
		Integer obj = 100; // 기본형데이터
//		obj = null;
		System.out.println(obj.MAX_VALUE);
		Byte obj2 = 20;
		int value1 = obj.intValue();
		int value2 = obj + 100; //UnBoxing
		Integer obj3 = 20_000;
		int value4 = obj3.parseInt("20_000"); //_ 사용시 오류 발생
	}

}
