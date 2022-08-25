package chapter11;

public class MemberComparable implements Comparable<MemberComparable>{
	String name;
	MemberComparable(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(MemberComparable o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
}
