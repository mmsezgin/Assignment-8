package assignment8_day23;

import java.util.Scanner;

public class Q12_ToBeOrNotToBe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("To be or not to be");

		System.out.println("Enter a boolean value:");
		boolean b1 = sc.nextBoolean();

		System.out.println("Enter a second thought boolean value:");
		boolean b2 = sc.nextBoolean();

		sc.close();

		System.out.println(hamletQuote(b1, b2));


	}
	public static boolean hamletQuote(boolean toBe, boolean notToBe) {
		return (toBe || notToBe);


	}
}
/*
Question-12

The danish prince most famous quote is "to be or not to be". thats a classic example of boolean logic.

the hamletQuote method only returns true if one of or both of the boolean parameters is true.

example:

hamletQuote(true, false)
returns true

hamletQuote(false,true)
returns true

hamletQuote(true,true)
returns true

hamletQuote(false,false)
returns false

 

hint: use the truth table for this one, this can be done with one if and a logical operator.
*/