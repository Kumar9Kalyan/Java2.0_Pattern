
public class SquareHollowPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern(9);
	}
	
	private static void printPattern(int num) {
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if (i==0||i==num-1||j==0||j==num-1) 
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
