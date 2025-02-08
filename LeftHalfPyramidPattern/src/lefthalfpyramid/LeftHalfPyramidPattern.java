package lefthalfpyramid;

public class LeftHalfPyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern(6);
	}
	
	static void printPattern(int nums) {
		for(int i=0;i<nums;i++) {
			for(int j=1;j<nums-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
				System.out.print("*");
			System.out.println();
		}
		
	}

}
