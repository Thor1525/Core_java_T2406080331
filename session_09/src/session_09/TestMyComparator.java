package session_09;

import java.util.TreeSet;

public class TestMyComparator {
	public static void main(String args[]) {

		TreeSet t=new TreeSet(new MyComparator());//internally invoking or calling compareTo as default condition for TreeSet is ascending
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(10);
		
		/*t.add("Shreyash");
		t.add("Rahul");
		t.add("Chris");
		t.add("Yuvraj");
		t.add("Ranbir");*/
		System.out.println(t);
	}

}
