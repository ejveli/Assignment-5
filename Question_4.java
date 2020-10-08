package Assignment_5_ForLoop;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {

		// Write a while loop that lets the user enter a number.
		// The number should be multiplied by 10, and the result stored in the variable
		// product.
		// The loop should iterate as long as product contains a value less than 100.

		System.out.println("Enter a number:");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int sum=0;

		while (number < 100 ) {
			
			if(number % 10 ==0) {
			
			sum=sum+number;
			}
			number++;
		}
		System.out.print("Total: "+sum);

	}

}
