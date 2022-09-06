package Java8;

import java.util.ArrayList;
import java.util.List;

public class filter {

	public static void main(String[] args) {
		
		List<String>name=new ArrayList<>();
		name.add("Deepak");
		name.add("Kumar");
		name.add("Julie");
		name.add("Gupta");
		name.stream().filter((String name)->name.length()>5).forEach(System.out::println);
	}

}
