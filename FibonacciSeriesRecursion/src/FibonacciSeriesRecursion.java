import java.util.Scanner;

public class FibonacciSeriesRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms for Fibonacci:");
		int terms = sc.nextInt();
		System.out.println("Fibonacci series is: ");
		for(int i=0;i<terms;i++) {
			System.out.print(fibonacci(i)+ " ");
		}
		sc.close();
		
	}
	
	private static int fibonacci(int n) {
		if (n==0)
			return 0;
		if(n==1)
			return 1;
		return fibonacci(n-1)+fibonacci(n-2);
	}

}
