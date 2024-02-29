package session_09;

import java.util.Stack;

public class StackDemo {
	public static void main(String args[]) {
		Stack<String> s=new Stack<String>();
		s.push("a");
		s.add("b");
		s.push("c");
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.search("a"));
		System.out.println(s.search("c"));//if not -1
		System.out.println(s.empty());
		
		
		
	}

}
