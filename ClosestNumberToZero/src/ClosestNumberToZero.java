import java.util.Scanner;

public class ClosestNumberToZero {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter size of array: ");
			int size = sc.nextInt();
			int nums[] = new int[size];
			System.out.println("Enter "+size+" numbers: ");
			for (int i=0;i<size;i++) {
				nums[i] = sc.nextInt();
			}
			System.out.println("Closest number to zero: "+ClosestNumToZero(nums));
	}
	
	public static  int ClosestNumToZero(int[] nums) {
		int closestToZero =0, absoluteValue;
		int minDistance = Integer.MAX_VALUE;
		for (int i=0;i<nums.length;i++) {
			absoluteValue = Math.abs(nums[i]);
			if (absoluteValue<minDistance || (absoluteValue == minDistance && absoluteValue> closestToZero) ) {
				closestToZero = nums[i];
				minDistance = absoluteValue;
				
			}
		}
		return closestToZero;
	}

}
