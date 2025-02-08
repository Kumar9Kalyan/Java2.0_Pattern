package butterfly;

public class ButterflyPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			printPattern(8);
	}
	private static void printPattern(int nums) {
		for(int i=1;i<=nums;i++) {
			for(int j=1;j<=2*nums;j++) {
				if(j>i&&j<=2*nums-i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		for(int i=nums;i>=1;i--) {
			for(int j=1;j<=nums*2;j++) {
				if(j>i&&j<=nums*2-i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
