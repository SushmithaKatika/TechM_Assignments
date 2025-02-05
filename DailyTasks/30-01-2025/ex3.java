package full_stack;

public class ex3 {
public static void main(String[] arg) {
	int arr[]= {10,20,30,40,50,60};
	int arr1[]= {22,43,34,67,75,45};
	int j=0;
	for(int i=0;i<arr.length;i=i+2) {
		if(i%2==0) {
			System.arraycopy(arr, i, arr1, j,1);
			j++;
		}
	}
	for(int i=0;i<arr1.length;i++) {
		System.out.print(arr1[i]+" ");
	}
	
}
}
