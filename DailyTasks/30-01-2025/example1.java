package full_stack;
//import java.util.*;
public class example1 {
	public static void main(String args[]) {
		int num= 7;
		String res=	switch(num) {
		case 1,2: yield "hi";
		case 3,4,5: yield "hello";
		default: yield "efl";
		};
		System.out.println(res);
		}

}
