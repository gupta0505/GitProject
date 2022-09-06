package java8;
import java.util.*;
import java.util.stream.*;


public class Stream {

	public static void main(String[] args) {
		
		List <Integer>l=new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		
		l.stream().forEach(System.out::println());
	
	}
}
