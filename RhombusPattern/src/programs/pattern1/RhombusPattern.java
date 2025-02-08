package programs.pattern1;
public class RhombusPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern(6);
	}
	
	private static void printPattern(int num) {
		for(int i=0;i<num;i++) {
			for(int k=1;k<num-i;k++)
				System.out.print(" ");
			for(int j=0;j<num;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
