
public class ZeroOneTrianglePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPatter(6);
	}
	
	private static void printPatter(int num) {
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				if((i+j)%2==0)
					System.out.print(1+" ");
				else
					System.out.print(0+" ");
			}
			System.out.println();
		}
	}

}
