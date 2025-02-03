
public class HollowTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern(7);
	}
	private static void printPattern(int num) {
		int st=1;
		for(int i=0;i<num;i++) {
			for(int k=1;k<num-i;k++)
				System.out.print(" ");
			for(int j=0;j<st;j++)
			{
				if(j==0||j==st-1||i==num-1)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
			st+=2;
		}
	}

}
