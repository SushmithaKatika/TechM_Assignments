package full_stack;

import java.util.Arrays;

public class ex5 {
public static void main(String[] arg) {
	int[][] arr={{1,2,3},{4,5,6}};
	int[][] arr1={{1,2,3},{4,5,6}};
	int[] a= {1,2,3};
	int[] b= {1,2,3};
	System.out.println(Arrays.equals(a,b));
	System.out.println(Arrays.deepEquals(arr, arr1));
	System.out.println(a==b);
	
	
		
	}
	
}
