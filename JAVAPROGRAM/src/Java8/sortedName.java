package Java8;

import java.util.ArrayList;
import java.util.List;

public class sortedName {

	public static void main(String[] args) {
		
		List<String> name=new ArrayList<>();
		name.add("Deepak");
		name.add("Julie");
		name.add("Reshma");
		name.add("Deeksha");
		
		name.stream().sorted().forEach(System.out::println);
	}

}
