package ReverseArrayAtSpecifiedUsingInBuiltMethods;

import java.util.ArrayList;

import java.util.Collections;

public class ReverseArrayAtSpecifiedPositionUsingInBuiltMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10); 
		a1.add(4);
		a1.add(5);
		a1.add(2);
		a1.add(3);
		a1.add(6);
		a1.add(1);
		a1.add(3);
		a1.add(6);
		
		reverse(a1, 3);
	}

	private static void reverse(ArrayList<Integer> arr, int m) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		int n= arr.size();
		for(int i=m+1;i<n;++i) {
			
			a1.add(arr.remove(m+1));
		}
		
		
		
		Collections.reverse(a1);
		arr.addAll(a1);
		System.out.println(arr);
}
}


