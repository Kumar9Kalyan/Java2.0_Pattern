package ReverseNumberTriangle;

public class ReverseNumberTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern(6);
		printPatternVariant(6);
	}

	private static void printPattern(int nums) {
		int a=0;
		for(int i=nums;i>=1;i--) {
			a++;
			for(int j=1;j<=nums-i;j++)
				System.out.print(" ");
			int l=a;
			for(int j=0;j<i;j++) {
				
				System.out.print(l+++" ");
				
			}
			System.out.println();
				
		}
	}
	
	private static void printPatternVariant(int nums) {
		for(int i=1;i<=nums;i++) {
			for(int j=1;j<i;j++)
				System.out.print(" ");
			for(int j=i;j<=nums;j++)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}
