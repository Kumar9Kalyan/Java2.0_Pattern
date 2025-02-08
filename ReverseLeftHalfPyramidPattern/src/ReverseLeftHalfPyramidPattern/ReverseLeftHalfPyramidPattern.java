package ReverseLeftHalfPyramidPattern;

public class ReverseLeftHalfPyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern(6);
	}
	private static void printPattern(int nums) {
		for(int i=nums;i>=1;i--) {
			for(int j=1;j<=nums-i;j++)
				System.out.print(" ");
			for(int k=0;k<i;k++)
				System.out.print("*");
			System.out.println();
		}
	}

}
