package chapter12;

import java.awt.Toolkit;

public class BeepTask implements Runnable{
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
//			System.out.println("삐이~");
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}
