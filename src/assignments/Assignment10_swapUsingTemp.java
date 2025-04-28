package assignments;

public class Assignment10_swapUsingTemp {

public static void main(String args[]) {
        
       
        int[]  swap = { 12, 34, 11, 36, 87, 98, 93 };
        
        
        int temp = 0;

   
        for (int i = 0; i < swap.length; i++) {
            
            
            for (int j = i + 1; j < swap.length; j++) {
                
                
                if (swap[i] < swap[j]) {
                    
                  
                    temp = swap[i];     
                    swap[i] = swap[j]; 
                    swap[j] = temp;     
                }
            }
        }

     // Printing the first largest number (at index 0)

        System.out.println("First largest number is :" + swap[0]);
        
        // Printing the second largest number (at index 1)
        System.out.println("Second largest number is :" + swap[1]);

        // Printing the third largest number (at index 2)
        System.out.println("Third largest number is :" + swap[2]);
        
    }
}
