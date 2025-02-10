package Streams;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CaseConUsingStream {
	public static void main(String[] arg) {
		
		List<String> names=Arrays.asList("sushmitha","srujana","Manohar","sanjana");
		
		List<String> UpperCaseNames=names.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println("Upeer case Names : "+UpperCaseNames);
	}
}
