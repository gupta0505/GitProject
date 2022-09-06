package Collection;
import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
		
		Stack s=new Stack();
		s.push("Deepak");
		s.push("kumar");
		s.push("Julie");
		s.push(3);
		s.push(4);
		System.out.println(s);
		System.out.println(s.search("Deepak"));
		s.pop();
		s.pop();
		System.out.println(s);
		s.peek();
		System.out.println(s);
		
	}

}
