package Collection;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList l=new ArrayList();
		l.add(22);
		l.add(23);
		l.add(24);
		l.add(25);
		System.out.println(l);
		l.get(2);
		l.set(0, 21);
		l.add(26);
		System.out.println(l);
		System.out.println("--------");
		Iterator itr=l.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
		System.out.println("---------------");
		//for(integer number:l)
		//System.out.println(number);
	}

}
