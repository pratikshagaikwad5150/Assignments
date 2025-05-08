package assignments;

public class Assignment_17_Leftalignedpattern {
	
	    public static void main(String[] args) {
	        int rows = 5;  // You can change this value or take user input

	        for (int i = 1; i <= rows; i++) {
	        	for (int space = 1; space <= rows - i; space++) {
	                System.out.print(" ");
	            }
	            // Print i stars in each row
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            // Move to the next line
	            System.out.println();
	            
	        }
	    }
	}

	


