package Assignment_5_ForLoop;



public class Question_14 {

	public static void main(String[] args) {
/* Write nested loop to draw this pattern

##
#  #
#   #
#    #
#     #
#      #
#        #
	*/
		
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(j==i||j==1) {
					System.out.print("#");
					
				}else
													
					System.out.print(" ");
				
			}System.out.println();
		}
	
	}

}
