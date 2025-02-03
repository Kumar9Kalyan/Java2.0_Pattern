
public class NumberTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printPattern(5);
	}
	private static void printPattern(int num) {
		
		int a=1;
		for(int i=1;i<=num;i++) {
			for(int k=1;k<=num-i;k++)
				System.out.print(" ");
			for(int j=1;j<=i;j++){
				System.out.print(a+" ");
			}
			
			System.out.println();
			
			a++;
		}
	}

}
