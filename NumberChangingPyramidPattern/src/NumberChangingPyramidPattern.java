
public class NumberChangingPyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printPattern(5);
	}
	private static void printPattern(int nums) {
		int a=1;
		for(int i=0;i<nums;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(a+" ");
				a++;
			}
			System.out.println("");
		} 
	}

}
