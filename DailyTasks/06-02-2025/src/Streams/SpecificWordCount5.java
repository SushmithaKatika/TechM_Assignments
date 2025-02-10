package Streams;

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
public class SpecificWordCount5 {
	public static void main(String[] args) {
		List<String> fruit=Arrays.asList("Apple","Avacado","Banana","orange","pineapple","Grapes");
		System.out.println("Enter specific letter to count");
		Scanner sc=new Scanner(System.in);
		String targetLetter=sc.next();
		
	long Wordcount = fruit.stream().filter(fruits -> fruits.startsWith(String.valueOf(targetLetter))).count();
		
	System.out.println("Number of words Starting with "+targetLetter+" : "+Wordcount);
	}
}
