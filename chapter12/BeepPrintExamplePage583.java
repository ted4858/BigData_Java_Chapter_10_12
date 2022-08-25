package chapter12;

import java.awt.Toolkit;

public class BeepPrintExamplePage583 {
	public static void main(String[] args) {
		// 1번 Thread 생성자 호출
		Runnable beepTask = new BeepTask();
		Thread thread1 = new Thread(beepTask);
		thread1.start();
		
		// 2번 익명 구현 객체
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; i++) {
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
				}
			}
		});
		thread2.start();
		
		// 3번 람다식
		Thread thread3 = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i = 0; i < 5; i++) {
				toolkit.beep();
				try { Thread.sleep(500); } catch(Exception e) {}
			}
		});
		thread3.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}
