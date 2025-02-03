
public class PalindromeTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern(6);
	}
	
	private static void printPattern(int num) {
		int st=1;
		for(int i=0;i<num;i++) {
		for(int k=1;k<num-i;k++)
			System.out.print(" ");
		int count= st/2+1;
		for(int j=0;j<st;j++) {
			System.out.print(count);
			if(j<st/2)
				count--;
			else
				count++;
		}
		st+=2;
		System.out.println();
		}
	}

}
