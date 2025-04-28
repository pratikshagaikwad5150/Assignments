package assignments;

public class Assignment10_swapWithouUsingTemp {


    public static void main(String[] args) {
        
      
        int[] swap = { 12, 34, 11, 36, 87, 98, 93 };

        
        for (int i = 0; i < swap.length; i++) {

            
            for (int j = i + 1; j < swap.length; j++) {

           
                if (swap[i] < swap[j]) {

                    swap[i] = swap[i] + swap[j];

                   
                    swap[j] = swap[i] - swap[j];

                    
                    swap[i] = swap[i] - swap[j];

                   
                }
            }
        }

      
        // Printing the second largest number
        System.out.println("Second largest number is :" + swap[1]);

        // Printing the third largest number
        System.out.println("Third largest number is :" + swap[2]);
    }
}
