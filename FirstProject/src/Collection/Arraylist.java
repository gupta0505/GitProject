package Collection;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
	
		ArrayList al=new ArrayList();
		al.add("Mango");
		al.add("Apple");
		al.add("Banana");
		al.add("lichi");
		System.out.println("add object"+al);
		al.add(2,"Orange");
		System.out.println("add index"+al);
		al.addAll(al);
		System.out.println("add all"+al);
		//al.clear();
		System.out.println(al);
		al.contains("lichi");
		System.out.println("contain"+al);
		//al.remove(0);
		System.out.println(al);
		//al.removeAll(al);
		System.out.println("remove all"+al);
		//al.addAll(al);
		System.out.println(al);
		al.containsAll(al);
		System.out.println("contains all"+al);
		al.size();
		System.out.println("size"+al);
		
	}
}

	
		



