package programs.pattern;

public class DiamondStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern(6);
	}
	private static void printPattern(int nums) {
		for(int i=1;i<=nums;i++) {
			for(int j=1;j<=nums-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=nums-1;i>=1;i--) {
			for(int j=1;j<=nums-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
