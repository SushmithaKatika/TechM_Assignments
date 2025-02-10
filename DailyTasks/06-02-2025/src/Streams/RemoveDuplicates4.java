package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates4 {
	public static void main(String[] arg) {
		
		List<Integer> numbers=Arrays.asList(1,2,1,3,43,54,6,7,6,3,1,5,6);
		List<Integer> removeDuplicates=numbers.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println("Unique Numbers : "+removeDuplicates);
	}
}
