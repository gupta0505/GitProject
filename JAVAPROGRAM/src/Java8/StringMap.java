package Java8;

import java.util.ArrayList;
import java.util.List;

public class StringMap {

	public static void main(String[] args) {
		
		List<String> name=new ArrayList<>();
		
		name.add("aaaaaaa");
		name.add("bbbb");
		name.add("ccccccccccc");
		name.add("ddddddddddddddd");
		
		name.stream().map(String::length).forEach(System.out::println);

	}

}
