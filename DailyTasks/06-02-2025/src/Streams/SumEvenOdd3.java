package Streams;

import java.util.List;
import java.util.Arrays;
public class SumEvenOdd3 {
	public static void main(String[] arg) {
		List<Integer> numbers=Arrays.asList(1,3,2,54,32,12);
		
		int evenSum=numbers.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
		int oddSum=numbers.stream().filter(n->n%2!=0).mapToInt(Integer::intValue).sum();
		System.out.println("Even sum : "+evenSum+"  AND "+"Odd Sum : "+oddSum);
	}

}
