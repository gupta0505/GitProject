package Deepak;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;



public class List_C {

	public static void main(String[] args) {
		
		Stack s=new Stack();
		s.push(12);
		s.add(13);
		s.push(14);
		s.push(15);
		System.out.println(s);
		s.pop();
		s.peek();
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.empty());
		System.out.println(s.search(2));
		System.out.println(s.search(13));
		
		
		
		//VECTOR----
		/*int i;
		Vector v=new Vector(2);
		System.out.println(v.capacity());
		v.add("Bihar");
		v.add("Nagpur");
		System.out.println(v);
		v.add(1, "M'Pur");
		v.clone();
		v.addElement("pune");
		System.out.println(v);
		v.remove(3);
		System.out.println(v);
		v.remove("M'Pur");
		System.out.println(v);
		System.out.println(v.size());
		v.get(1);
		System.out.println(v.get(1));
		System.out.println(v.elementAt(0));
		v.set(0, "delhi");
		System.out.println(v);
		System.out.println(v.firstElement());
		for(i=1;i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);
		
		
		//LINKLIST---
		/*LinkedList l=new LinkedList();
		l.add(null);
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		System.out.println(l);
		l.add(2,1.1);
		l.add(4, 2.2);
		l.add(6, 3.3);
		l.add(8, 4.4);
		System.out.println(l);
		l.remove(0);
		System.out.println(l);
		l.addFirst(0);
		l.addLast(6);
		System.out.println(l);
		//l.get(2);
		l.getFirst();
		System.out.println(l);
		l.getLast();
		System.out.println(l);
		l.removeFirst();
		System.out.println(l);
		l.indexOf(9);
		System.out.println(l);
		l.lastIndexOf(5);
		System.out.println(l);*/
		
		
		//ARRAYLIST---
		/*ArrayList a=new ArrayList();
		a.add("Deepak");
		a.add("Julie");
		a.add("Deeksha");
		a.add(null);
		a.add("Reshma");
		a.add("anuj");
		System.out.println(a);
		a.add(1, 9);
		a.add(3, 23);
		a.add(5, 31);
		System.out.println(a);
		a.remove(6);
		a.add(7, 30);
		a.add(9, 27);
		System.out.println(a);
		System.out.println("-------------");
		a.size();
		System.out.println(a);
		System.out.println("-----------");
		a.get(0);
		System.out.println(a);
		a.contains(a);
		System.out.println(a);
		a.containsAll(a);
		System.out.println(a);
		//a.clear();
		//System.out.println(a);
		//System.out.println(a);
		a.isEmpty();
		System.out.println("--"+a);*/
		
		

}
}
