package chapter11;

import java.util.Arrays;

public class SearchExample {
	public static void main(String[] args) {
		//기본 타입값 검색
		int[] scores = { 99, 97, 98 };
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("찾은 인덱스: " + index);
		
		//문자열 검색
		String[] names = { "홍길동", "박동수", "김민수" };
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "홍길동");
		System.out.println("찾은 인덱스: " + index);
		
		//객체 검색
		MemberComparable m1 = new MemberComparable("홍길동");
		MemberComparable m2 = new MemberComparable("박동수");
		MemberComparable m3 = new MemberComparable("김민수");
		MemberComparable[] members = { m1, m2, m3 };
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m1);
		System.out.println("찾은 인덱스: " + index);
	}
}
