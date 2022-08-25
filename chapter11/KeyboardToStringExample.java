package chapter11;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) {
		byte[] bytes = new byte[1024]; //임시버퍼 == (비어있는 배열)
		
		System.out.print("입력 >> ");
		int readByteLength = 0;
		try {
			readByteLength = System.in.read(bytes); // 키보드에서 받은 바이트를 복사하고 갯수를 리턴
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String str = new String(bytes, 0, readByteLength - 2); // \r\n = 13,10 제외
		System.out.println(str);
	}
}
