package Deepak;

import java.util.Enumeration;
import java.util.Vector;

public class Corsor {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		for(int i=0;i<=10;i++)
		{
			v.add(i);
			//v.add(1, null);
			//v.setElementAt(1, 1);
			//v.clone();
			//v.size();
			//v.clear();
		}
		System.out.println(v);
		Enumeration e=v.elements();
		while(e.hasMoreElements());
		{
			Integer i=(Integer)e.nextElement();
			if(i%2==0)
			{
				System.out.println(i);
		}
		System.out.println(v);
		
	}

}
}
