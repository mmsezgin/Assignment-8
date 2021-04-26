package assignment8_day23;

import java.util.Scanner;

public class Q14_ThreeLockBoolean {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);



		System.out.println("Enter first boolean value:" );
		boolean b1 = sc.nextBoolean();

		System.out.println("Enter second boolean value:" );
		boolean b2 = sc.nextBoolean();

		System.out.println("Enter third boolean value:" );
		boolean b3 = sc.nextBoolean();

		sc.close();

		System.out.println(threeLocks(b1, b2, b3));

	}

	public static boolean threeLocks(boolean a, boolean b, boolean c) {
		return ((a == true && b == true) || c == true);

	}

}

/*
Question-14

This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.

It returns true only if both a and b are true or c is true.

https://en.wikipedia.org/wiki/Truth_table
*/