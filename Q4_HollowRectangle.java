package assignment8_day23;

public class Q4_HollowRectangle {

	public static void main(String[] args) {
		
		printHollowRect();
	}
	
	public static void printHollowRect() {
		for (int i=1; i<=5; i++) {
			
			if (i==1 || i==5) {
				System.out.println("*****");
			}else {
				System.out.println("*   *");
			}

		}
	}

}
/*
 Question-4

Create a method printHollowRect that prints a 5 on 5 hollow rectangle:

q4


hint: you will need to use two nested for loops for that, and an if that checks if its the last or first iteration of the loop (so you will know whet to print "*" or " ")
*/