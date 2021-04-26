package assignment8_day23;

import java.util.Scanner;

public class Q6_NextThree {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num1=sc.nextInt();
		next3(num1);
	}
	// next3() method gets an int argument and prints the next 
	// 3 numbers after that number.
	public static void next3(int number) {
		System.out.println("next 3 are:");

		for(int i=number; i<=number+3; i++) {
			System.out.print(i+" ");

		}
	}

}
