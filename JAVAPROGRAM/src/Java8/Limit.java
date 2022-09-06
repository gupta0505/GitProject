package Java8;

import java.util.ArrayList;
import java.util.List;

public class Limit {

	public static void main(String[] args) {
		
		List<String>name=new ArrayList<>();
		name.add("dddddddd");
		name.add("jjjjj");
		name.add("ssssssssss");
		name.add("pppp");
		name.add("qqqqqqqq");
		name.add("yyyy");
		name.stream().limit(4).forEach(System.out::println);
	}

}
