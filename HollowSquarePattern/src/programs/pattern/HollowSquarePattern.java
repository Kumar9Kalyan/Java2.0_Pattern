package programs.pattern;

public class HollowSquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern(6);
	}
	private static void printPattern(int nums) {
		for(int i=0;i<nums;i++) {
			for(int j=0;j<nums;j++) {
				if(i==0||i==nums-1||j==0||j==nums-1)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
	}

}
