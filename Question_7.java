package Assignment_5_ForLoop;


public class Question_7 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to print all the numbers between 1 and 100 (including 1 and 100) 
		 * which are divisible by 5.
		 */
		
		int i=1;

		while (i <= 100 ) {
			
			if(i % 5 ==0) {
			
				System.out.print(" "+i);
			}
			i++;
		}
		
				
	}

}
