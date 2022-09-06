package Java8;

import java.util.ArrayList;
import java.util.List;

public class Print {

	public static void main(String[] args) {
		
		List<String>name=new ArrayList<>();
		name.add("Deepak");
		name.add("Kumar");
		name.add("Julie");
		name.stream().forEach(System.out::println);

	}

}
