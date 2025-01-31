package full_stack;

public class ex2 {
public static void main(String[] arg) {
	int arr[]= {10,20,30,40,50,60};
	int arr2[]= {21,55,35,64,89,46};
	
	for(int i=0;i<arr.length;i++) {
		System.arraycopy(arr, 1, arr2, 3, 3);
	}
	for(int i=0;i<arr.length;i++){
		System.out.print(arr2[i]+" ");
	}
	
	
}
}
