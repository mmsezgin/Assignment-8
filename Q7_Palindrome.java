package assignment8_day23;

import java.util.Scanner;

public class Q7_Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input:");
		int num1=sc.nextInt();
		
		System.out.println("output:"+isPalindrome(num1));

	}
	
	// isPalindrome() method takes an integer and check if it is palindrome or not
	// method works without converting int to string
	public static boolean isPalindrome(int number) {
		
		// Get the number, put it in another variable
		//Reverse it, compare both of them
		// if same palindrome, if not NOT a palindrom
	    int numHolder = number;
	    int reverse = 0;

	    while (numHolder != 0) {
	        int remainder = numHolder % 10;
	        reverse = reverse * 10 + remainder;
	        numHolder = numHolder / 10;
	    }

	    // Compare input integer with reversed one, if equal PALINDROME
	    return number == reverse; 
	}
}
/*	By using string we can also do it
 *     String intStr = String.valueOf(integer); 
    return intStr.equals(new StringBuilder(intStr).reverse().toString());
    */
