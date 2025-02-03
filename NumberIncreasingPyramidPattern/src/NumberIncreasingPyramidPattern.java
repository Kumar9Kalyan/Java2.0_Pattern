
public class NumberIncreasingPyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern(5);

	}
	private static void printPattern(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++)
				System.out.print(j+" ");
		System.out.println();
		}
	}

}
