package Collection;
import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		System.out.println(v.capacity());
		
		for(int i=1;i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v.capacity());
		
		v.remove(2);
		v.addElement("A");
		v.addElement("B");
		v.removeElementAt(3);
		
		System.out.println(v.capacity());
		System.out.println(v);
	}

}
