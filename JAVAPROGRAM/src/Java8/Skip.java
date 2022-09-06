package Java8;

import java.util.ArrayList;
import java.util.List;

public class Skip {

	public static void main(String[] args) {
		
		List<String>n=new ArrayList<>();
		n.add("S");
		n.add("D");
		n.add("J");
		n.add("P");
		n.add("R");
		n.add("A");
		n.stream().skip(3).forEach(System.out::println);

	}

}
