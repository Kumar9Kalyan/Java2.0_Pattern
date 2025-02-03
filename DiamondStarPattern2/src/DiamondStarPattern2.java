
public class DiamondStarPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
printPattern(6);
	}

	private static void printPattern(int num) {
		for(int i=1;i<=num;i++) {
			for(int k=0;k<num-i;k++)
				System.out.print(" ");
			for(int j=1;j<=2*i-1;j++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=num-1;i>=1;i--) {
			for(int k=1;k<=num-i;k++)
				System.out.print(" ");
			for(int j=1;j<=2*i-1;j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
