package ReverseArraySpecifiedPosition;

import java.util.ArrayList;
import java.util.Arrays;


public class ReverseArrayAtSpecifiedPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ls = new ArrayList<Integer>(2);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		ls.add(7);
		reverseArray(ls, 1);
	}

	public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.

        Object[] arr1 = arr.toArray();
         int z= arr1.length;

        for(int i=m+1;i<(arr.size()+m+2)/2;i++){
            int temp = (int) arr1[i];
            int t= --z;
            arr1[i]= arr1[t];
            arr1[t]= temp;
        }
       
        System.out.println(Arrays.asList(arr1));
    }
}
