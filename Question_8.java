package Assignment_5_ForLoop;

import java.util.Scanner;

public class Question_8 {

	public static void main(String[] args) {
		/*
		 * Write a program to calculate the sum of the numbers from 1 till upper bound.
		 * If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15. 
		 * If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66. 
		 * If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.
		 * You should use a while loop.
		 */

		System.out.println("Enter upper bound:");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		int sum = 0,i=1;
		
		while(i<number) {
			
			System.out.print(i+" + " );
			sum=sum+i;
			i++;
		}
		System.out.print(i);
		System.out.print(" = "+(i+sum));
	}

}
