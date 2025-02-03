
public class NumberIncreasingReversePyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern(6);
	}
	
	private static void printPattern(int num) {
		for(int i=num;i>0;i--) {
			int a=1;
			for(int j=1;j<=i;j++) {
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	}

}
