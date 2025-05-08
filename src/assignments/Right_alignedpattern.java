package assignments;

public class Right_alignedpattern {

	
	    public static void main(String[] args) {
	        int rows = 5;  // You can change this or take user input

	        for (int i = 1; i <= rows; i++) {
	            // Print leading spaces
	            
	            // Print stars
	            for (int star = 1; star <= i; star++) {
	                System.out.print("*");
	            }
	            // Move to next line
	            System.out.println();
	        }
	    }
	
	}

