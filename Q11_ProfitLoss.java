package assignment8_day23;

import java.util.Scanner;

public class Q11_ProfitLoss {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter purchasing price:");
		int num1 = sc.nextInt();

		System.out.println("Enter selling price:");
		int num2 = sc.nextInt();

		sc.close();

		System.out.println(c_profits(num1, num2));


	}

	public static String c_profits(int buyPrice, int sellPrice) {
		return ((buyPrice < sellPrice) ? "profit" : (buyPrice > sellPrice) ? "loss" : "no loss");
	}

}
/*
 * Question-11

c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
it returns a string value that can be "profit","loss","no loss"

for example:
c_profis(100,1500)
returns : "profit"

c_profis(20,5)
returns : "loss"

c_profis(100,100)
returns : "no loss"
*/
