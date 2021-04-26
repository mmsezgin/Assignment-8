package assignment8_day23;

import java.util.Scanner;

public class Q2_Cube {

	public static void main(String[] args) {
			
			cube();
					
	}	
	
	//cube() method takes cube of the given numbers
	public static void cube () {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("input:");
			int num1=sc.nextInt();
			System.out.println("output:"+(num1*num1*num1));
	}

	}
/*	
Question-1

Create a method called "plus", its return is void and it gets no arguments.

It asks the user to input two numbers, then it will add them and print the result.
Create a scanner within the plus method.

Example:

enter first number:
1
enter second number:
2
result: 3

Question-2

Create a method called cube. Write all required code inside this method in order to ask the user for a number and then prints the cubed value of that number:

Example:

input: 5
output: 125
*/
