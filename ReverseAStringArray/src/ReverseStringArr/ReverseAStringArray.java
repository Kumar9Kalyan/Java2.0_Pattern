package ReverseStringArr;

import java.util.Arrays;

public class ReverseAStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			reverseStringArray(new String[] {"Kalyan","Sounding","Pics"});
	}

	private static void reverseStringArray(String[] arr) {
		StringBuilder strBuild = new StringBuilder();
		
		for(int i=arr.length-1;i>=0;i--) {
			strBuild.append(arr[i]+" ");
			
		}
		System.out.println(strBuild.toString());
		String[] reverse = strBuild.toString().split(" ");
		System.out.println(Arrays.toString(reverse));
	}
}
