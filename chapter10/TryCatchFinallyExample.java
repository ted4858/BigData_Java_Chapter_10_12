package chapter10;

import java.lang.*;
import java.util.*;

public class TryCatchFinallyExample extends Object{
	public static void main(String[] args) throws InterruptedException {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		} finally {
			System.out.println("Try-Catch 끝.");
		}
		System.out.println("Well done.");
		
		callMethod();
		callMethod1();
	}
	
	private static void callMethod() throws InterruptedException{
		Thread.sleep(1000);
	}
	private static void callMethod1(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
