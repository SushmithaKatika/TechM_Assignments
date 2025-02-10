package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.Optional;

public class maxMin7 {
	public static void main(String[] arg) {
		//max & min is case sensitive
		
		List<String> names=Arrays.asList("Sushmitha","sushmitha","Srujana","Deepu","kavya","madhu");
		Optional maxName=names.stream().max(String::compareTo);
		System.out.println("Maximum String : "+maxName.get());
		
		Optional minName=names.stream().min(String::compareTo);
		System.out.println("Minimum String : "+minName.get());
		System.out.println("\n");
		
		List<Integer> numbers=Arrays.asList(1,2,1,3,43,54,6,7,6,3,1,5,6);
		OptionalInt maxNum=numbers.stream().mapToInt(Integer::intValue).max();
		System.out.println("Maximum Integer : "+maxNum.getAsInt());
		OptionalInt minNum=numbers.stream().mapToInt(Integer::intValue).min();
		System.out.println("Minimum Integer : "+minNum.getAsInt());
	}

}
