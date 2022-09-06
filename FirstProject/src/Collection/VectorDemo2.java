package Collection;
import java.util.*;

public class VectorDemo2 {

	public static void main(String[] args) {
		
		Vector v=new Vector(5);
		v.add("Cake");
		v.add("choco");
		v.add("icecream");
		v.add("pizza");
		System.out.println("vector size-"+v.size());
		System.out.println("vector capacity-"+v.capacity());
		
		v.addElement("Rose");
		v.addElement("Lily");
		System.out.println("-----");
		System.out.println("Size-"+v.size());
		System.out.println("Capacity-"+v.capacity());
		
		if(v.contains("cake"));
		{
			//System.out.println(v.indexOf("cake"));
		
		{
			System.out.println("cake is not present");
			
		}
		
		System.out.println("----------");
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
	}

}
}
