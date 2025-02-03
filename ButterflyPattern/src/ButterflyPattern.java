
public class ButterflyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
printPattern(6);
	}
	
	private static void printPattern(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=2*num;j++) {
				if(j>i&&j<=2*num-i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		for(int i=num;i>=1;i--) {
			for(int j=1;j<=2*num;j++) {
				if(j>i&&j<=2*num-i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();

		}
	}

}
