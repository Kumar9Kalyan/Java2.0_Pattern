
public class NumberTrianglePattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern(6);
	}
	
	private static void printPattern(int num) {
		int a =1;
		for(int i=0;i<num;i++) {
			for(int k=1;k<num-i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(a);
				System.out.print(" ");
			}
			a++;
			System.out.println();
		}
	}

}
