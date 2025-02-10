package Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class sortString6 {
	public static void main(String[] arg) {
		
		List<String> names=Arrays.asList("Sushmitha","sushmitha","Srujana","Deepu","kavya","madhu");
		
		List<String> sortedNames=names.stream().sorted().collect(Collectors.toList());
		System.out.println("Acending Order : "+sortedNames);
		List<String> sortedDesNames=names.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println("Decending Order : "+sortedDesNames);
	}
}
