
public class NumberIncreasingPyramidPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
printPattern(7);
	}
	
	private static void printPattern(int num) {
		int a=1;
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(a);
				System.out.print(" ");
			}
			a++;
			System.out.println("");
		}
	}

}
