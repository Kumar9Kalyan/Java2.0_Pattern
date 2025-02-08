package Reverse;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int[] arr1 =reverse(new int[]{2,3});

		for(int i :arr1) {
			System.out.print(i+" ");
		}
	}
	
	private static int[] reverse(int[] arr) {
		for(int i=0;i<arr.length/2;i++) {
			int temp = arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
			
		}
		return arr;
	}

}
