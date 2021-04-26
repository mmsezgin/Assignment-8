package assignment8_day23;

import java.util.Scanner;

public class Q9_MaxReverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		System.out.println("returns:"+max(num1,num2));
	}
	
	public static int max(int num1, int num2) {
		if (num1 > num2) {
			return num2;
		}else {
			return num1;
		}
	}

}
