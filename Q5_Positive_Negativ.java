package assignment8_day23;

import java.util.Scanner;

public class Q5_Positive_Negativ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("input:");
		int num1=sc.nextInt();
		
		System.out.println("sign("+num1+") =>"+sign(num1));
	}
	
	//sign method gets a number and tell us if it is positive
	//negative or zero. If positive returns 1,
	//if negative -1, if zero returns 0
	public static int sign(int number) {
		
		if(number < 0) {
			return -1;
		}else if(number == 0) {
			return 0;
		}else {
			return 1;
		}
		
	}

}
