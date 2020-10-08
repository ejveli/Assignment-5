package Assignment_5_ForLoop;



public class Question_11 {

	public static void main(String[] args) {
/* Print following output using nested for loops:


4       3       2      1

     3       2      1

         2       1

              1
	*/

	
		int m = 4; 

		for (int i = 1; i <= 4; i++) {

			for (int y = 1; y < i; y++) {
				System.out.print("  ");
			}
			for (int x = m; x >= 1; x--) {
				System.out.print(x + "   ");
			}

			System.out.println();
			m--;    			   
		}
	}
	
	}
	
		
		



