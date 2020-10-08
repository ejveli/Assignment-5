package Assignment_5_ForLoop;

public class Question_6 {

	public static void main(String[] args) {
		/*
		 * Write a program to print Fibonacci series of n terms where n is declared by
		 * user : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......
		 */
		
		int n=13;
		
		int num1=0;
		int num2=1;
		int sum=0;
		
		

		for ( int i = 1; i <= n; i++) {
			
			System.out.print(num1+", ");
			sum=num1+num2;
			num1=num2;
			num2=sum;
			
			}
				
	}

}
