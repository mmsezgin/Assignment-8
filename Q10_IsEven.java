package assignment8_day23;

import java.util.Scanner;

public class Q10_IsEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input:");
		int num1=sc.nextInt();
		
		System.out.println("is it even? :"+isEven(num1));
	}
	
	//isEven() method gets an integer number 
	//if it is EVEN returns true, otherwise false
	public static boolean isEven(int number) {
		if(number%2 ==0) {
			return true;
		}else {
			return false;
		}
	}
}
/*
 * Question-10

isEven method gets a number(int) if its even (2,4,8...) returns true.
if its odd return false.

for example:

isEven(1) --> false

isEven(8) --> true
*/
