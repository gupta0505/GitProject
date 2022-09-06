package Java8;

import java.util.ArrayList;
import java.util.List;

public class sortedNum {

	public static void main(String[] args) {
		
		List<Integer> num=new ArrayList<>();
		
		num.add(3);
		num.add(6);
		num.add(4);
		num.add(8);
		
		num.stream().sorted().forEach(System.out::println);
	}

}
