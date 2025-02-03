
public class ClosestNumberToZero2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(closestToZero(new int[]{2,-1,3,4}));
	}

	private static int closestToZero(int[] nums) {

		int closest = 0;
		int minDistance = Integer.MAX_VALUE;

		for (int i = 0; i < nums.length; i++) {

			int absoluteValue = Math.abs(nums[i]);
		
			if (absoluteValue < minDistance || (minDistance==absoluteValue&&absoluteValue>closest)) {
				closest = nums[i];
				minDistance=absoluteValue;
			}

		}
		return closest;
	}

}
