package Java8;

import java.util.ArrayList;
import java.util.List;

public class Mapping {

	public static void main(String[] args) {
		
		List<String>name=new ArrayList<>();
		name.add("Julie");
		name.add("Gupta");
		name.add("Deepak");
		name.add("Kumar");
		name.stream().map(String::length).forEach(System.out::println);

	}

}
