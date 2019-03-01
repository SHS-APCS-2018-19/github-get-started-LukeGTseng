package Recursion;
import java.util.*;

public class Reverse {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String rev = reverse(str);
		System.out.println(rev);
		if(rev.toLowerCase().equals(str.toLowerCase())) {
			System.out.println("Your input is a palindrome");
		} else {
			System.out.println("Your input is not a palindrome");
		}
	}
	
	public static String reverse(String str) {
		if(str.length()<=1 || str== null) {
			return str;
		} else {
			return reverse(str.substring(1)) + str.charAt(0);
		}
	}
}
