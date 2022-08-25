package chapter12;

public class Task1Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Task1 task1 = new Task1();
		Task1 task2 = new Task1();
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		thread1.start();
		thread2.start();
		System.out.println("Main Thread");
		Thread.sleep(10_000);
		
	}

}
