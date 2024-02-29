package session_09;
import java.util.Hashtable;
public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Temp,String> h=new Hashtable<Temp,String>();
		//System.out.println(h.size());
		//Initially capacity of Hashtable is 11
		h.put(new Temp(5),"A");
		h.put(new Temp(2),"B");
		h.put(new Temp(6),"C");
		h.put(new Temp(15),"D");
		h.put(new Temp(16),"F");
		System.out.println(h);

	}

}
