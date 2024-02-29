package session_09;
import java.util.LinkedList;
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Shreyash");
		l.add("40");
		l.add('K');
		l.add(null);
		System.out.println(l);
		l.set(0,"Karajgikar");
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		l.addFirst("Mr.");
		System.out.println(l);
		

	}

}
