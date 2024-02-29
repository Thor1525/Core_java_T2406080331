package session_09;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			l.add(i);
		}
		System.out.println(l);
		
		/*Iterator<Integer> itr=new l.Iterator();
		while(itr.hasNext()) {
			int i=itr.next();
			if(i%2)==0{
				itr.add(i);
			}
			else {
				itr.remove(i);
			}
			System.out.println();
			
					
		}*/

	}

}
