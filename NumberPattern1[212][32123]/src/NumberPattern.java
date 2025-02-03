/*    1
 *   212
 *  32123
 * 4321234
 *.........
 */

public class NumberPattern {

	public static void main(String... args) {
		
		printPattern(5);
		
	}
	
	private static void printPattern(int rows) {
	
		//For determining number of elements in a row and also at
		//what value count should start and then whether
		//it should increase or decrease
		int st=1; //st short for starting value
		
		
		for(int i=0;i<rows;i++) {
			for(int j=1;j<rows-i;j++)
				System.out.print(" ");
			int count= st/2+1;
			for(int k=0;k<st;k++) {
				System.out.print(count);
				if(k<st/2)
					count--;
				else
					count++;
				
			}
			System.out.println();
		
			st+=2;
		}
	}
}
