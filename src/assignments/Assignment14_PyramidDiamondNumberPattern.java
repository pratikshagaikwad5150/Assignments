package assignments;

public class Assignment14_PyramidDiamondNumberPattern {

	public static void main(String[] args) {
		int rows = 5;  
        // Top half of the diamond
        for (int i = 1; i <= rows; i++) {
            // Print  spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line
            System.out.println();
        }

        // Bottom half of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            // Print leading spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line
            System.out.println();
        }
    
	}

}
