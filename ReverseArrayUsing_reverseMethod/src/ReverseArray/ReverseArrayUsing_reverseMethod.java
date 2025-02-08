package ReverseArray;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayUsing_reverseMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseArray(new Integer[] {10,20,30,40});
	}
	
	private static void reverseArray(Integer[] arr) {
		
		Collections.reverse(Arrays.asList(arr));
		System.out.println(Arrays.asList(arr));
	}
	
}
