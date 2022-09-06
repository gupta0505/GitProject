package Java8;

import java.util.stream.Stream;

import OOPs.Student;

public class empty {

	public static void main(String[] args) {
		Stream<Student>emptyStream=Stream.empty();
		System.out.println(emptyStream.count());
	}

}
