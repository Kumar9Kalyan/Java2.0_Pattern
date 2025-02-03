import java.util.Scanner;

public class MaximumAvgSubArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size fo array:");
		int size= sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter array elemts:");
		for(int i=0;i<size;i++) {
			array[i]= sc.nextInt();
		}
		System.out.println("Enter subarray size(k):");
		int k = sc.nextInt();
		System.out.println("Maximum average of subarray: "+findMaxAvg(array, k));

	}
	private static double findMaxAvg(int[] nums,int k) {
		int sum=0;
		for(int i=0;i<k;i++)
			sum += nums[i];
		int maxSum = sum;
		for(int i=k;i<nums.length;i++) {
			sum += nums[i] - nums[i-k];
			maxSum = Math.max(maxSum, sum);
		}
		return (double)maxSum/k;
		
	}

}
