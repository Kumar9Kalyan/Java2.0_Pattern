import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roman value: ");
		String roman = sc.nextLine();
		System.out.println("Numerical value of roman value is: "+ romanToInt(roman));
		sc.close();
		
	}
	
	private static int romanToInt(String roman) {
		int result = 0;
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		for(int i=0;i<roman.length()-1;i++) {
			if(map.get(roman.charAt(i))<map.get(roman.charAt(i+1))) {
				result -= map.get(roman.charAt(i)); 
			}
			else {
				result += map.get(roman.charAt(i));
			}
		}
		return result + map.get(roman.charAt(roman.length()-1));
	}

}
