package full_stack;
import java.util.Arrays;

public class ex6 {
	public static void main(String[] arg) {
		int arr[]= {10,20,30,40,50,60};
		int arr1[]=Arrays.copyOfRange(arr, 1, 3);
		for(int j:arr1) {
			System.out.println(j);	
		}
		
	}
 
}
