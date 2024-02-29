package session_09;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap m=new HashMap<String,Integer>();
		m.put("Chris",700);
		m.put("Thor",800);
		m.put("Avengers",200);
		m.put("Shreyash",500);
		System.out.println(m);
		System.out.println(m.put("Chris", 100));
		System.out.println(m);

	}

}
