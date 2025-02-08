package TriangleStar;

public class TriangleStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern(25);
	}
	private static void printPattern(int nums) {
		for(int i=0;i<nums;i++) {
			for(int j=1;j<nums-i;j++)
				System.out.print(" ");
			for(int j=0;j<=i;j++)
				System.out.print("*"+" ");
			System.out.println();
		}
	}

}
