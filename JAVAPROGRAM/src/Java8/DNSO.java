package Java8;

import java.util.ArrayList;
import java.util.List;

public class DNSO {

	public static void main(String[] args) {
		
		List<String> l=new ArrayList<>();
		
		l.add("Jay");
		l.add("Nish");
		l.add("Deepak");
		l.add("Julie");
		
		l.stream().sorted().forEach(System.out::println);

	}

}
