package reverseArrayListAtPos;


import java.util.ArrayList;

public class ReverseArrayListAtPositionAfter {

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
	
	private static void reverse(ArrayList<Integer> arr,int m) {
		int left= m+1;
		int right = arr.size()-1;
		while(left<right) {
			int temp = arr.get(left);
			arr.set(left, arr.get(right));
			arr.set(right, temp);
			left++;
			right--;
		}
		System.out.println(arr);
	}

}


