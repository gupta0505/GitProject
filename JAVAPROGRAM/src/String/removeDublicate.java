package String;

import java.util.ArrayList;
import java.util.List;

public class removeDublicate {

	public static void main(String[] args) {
		
		List<String>l=new ArrayList<>();
		
		l.add("a");
		l.add("a");
		l.add("b");
		l.add("b");
		l.add("c");
		l.add("c");
		l.add("d");
		l.add("d");
		
		l.stream().distinct().forEach(System.out::println);
		
		
	}

}
