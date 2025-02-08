package MirrorImageTriangle;

public class MirrorImageTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern(8);
	}
	
	private static void printPattern(int nums) {
		for(int i=1;i<=nums;i++) {
			for(int j=1;j<i;j++)
				System.out.print(" ");
			for(int j=i;j<=nums;j++)
				System.out.print(j+" ");
			System.out.println();
		}
		for(int i=nums-1;i>=1;i--) {
			for(int j=1;j<i;j++)
				System.out.print(" ");
			for(int k=i;k<=nums;k++)
				System.out.print(k+" ");
			System.out.println();
		}
	}

}
