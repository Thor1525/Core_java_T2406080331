package session_09;

public class HashCodeDemo {
	public static void main(String args[]) {
		HashCodeDemo d1=new HashCodeDemo();
		HashCodeDemo d2=new HashCodeDemo();
		HashCodeDemo d3=d2;
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d3.hashCode());
	}

}
