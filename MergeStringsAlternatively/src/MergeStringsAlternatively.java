import java.util.Scanner;

public class MergeStringsAlternatively {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings: ");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		System.out.println("Alternatively merged strings: "+ mergeStringsAlternatively(s1, s2));
		
	}

	public static String mergeStringsAlternatively(String s1, String s2) {
		StringBuilder result = new StringBuilder();
		int i=0;
		while(i<Math.max(s1.length(), s2.length())) {
			if(i<s1.length())
				result.append(s1.charAt(i));
			if(i<s2.length())
				result.append(s2.charAt(i));
			i++;
			
		}
		return result.toString();
	}
}
