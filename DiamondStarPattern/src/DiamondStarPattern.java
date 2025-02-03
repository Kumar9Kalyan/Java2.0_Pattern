
public class DiamondStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printpattern(6);
	}
	private static void printpattern(int num) {
		int st=1;
		for(int i=0;i<num;i++) {
			for(int k=1;k<num-i;k++)
				System.out.print(" ");
			for(int j=0;j<st;j++)
				System.out.print("*");
			st+=2;
			System.out.println();
			}
		for(int i=num-1;i>=1;i--) {
			
			for(int k=num-i;k>0;k--)
				System.out.print(" ");
			for(int j=1;j<=i*2-1;j++)
				System.out.print("*");
			System.out.println();
			
		}
		
	}
	
	

}
