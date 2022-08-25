package chapter10;

public class ExceptionExample {
	public static void main(String[] args) {
		
		try {
			String data1 = args[0]; // 문자열
			String data2 = args[1]; // 문자열
			System.out.println(data1 + ", " + data2);	
		} catch(ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}
		
		try {
			int data1 = Integer.parseInt(args[0]);
			int data2 = Integer.parseInt(args[1]);
			int result = data1 + data2;
			System.out.println(result);	
		} catch(NumberFormatException ex) {
			ex.printStackTrace();
		}
		
		try {
			Thread.sleep(1_000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			String data = null;
			System.out.println(data.toString());
		} catch(NullPointerException ex) {
			ex.printStackTrace();
		}
		
		System.out.println("Well done!!");
		
	}
}
