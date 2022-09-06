package Java8;

import java.util.ArrayList;
import java.util.List;

public class Sorted {

	public static void main(String[] args) {
		
		List<String>l=new ArrayList<>();
		l.add("Z");
		l.add("A");
		l.add("J");
		l.add("P");
		l.add("R");
		l.stream().sorted().forEach(System.out::println);

	}

}
