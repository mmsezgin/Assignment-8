package assignment8_day23;

import java.util.Scanner;

public class Q1_Plus {

	public static void main(String[] args) {
		
		plus();
				

	}	
	//plus() method adds two numbers

	public static void plus() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number:");
		int num1=sc.nextInt();
		System.out.println("enter second number:");
		int num2=sc.nextInt();
		System.out.println("result:"+(num1+num2));
	}

}
/*Question-1

Create a method called "plus", its return is void and it gets no arguments.

It asks the user to input two numbers, then it will add them and print the result.
Create a scanner within the plus method.

Example:

enter first number:
1
enter second number:
2
result: 3
*/
