import java.util.Scanner;

public class SubSequence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string you want to find:");
		String s1 = sc.nextLine();
		System.out.println("Enter the string in which you want to search:");
		String s2 = sc.nextLine();
		System.out.println(isSubsequence(s1, s2)?"It exists":"Doesn't exist");

	}

	private static boolean isSubsequence(String s1, String s2) {
//		String 's' pointer is sp and String 't' pointer is tp
		int sp=0,tp=0;
		while(sp<s1.length() && tp <s2.length()) {
			if(s1.charAt(sp)==s2.charAt(tp))
				sp++;
			tp++;
		}
		return sp == s1.length();
	}
}
