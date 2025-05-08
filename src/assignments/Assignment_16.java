package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment_16 {

	public static void main(String[] args) {
		 
		        String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";

		        // Task 1: Split into words using whitespace
		        String[] words = paragraph.split("\\s+");

		        int count = 0;
		        List<Integer> indexes = new ArrayList<>();

		        // Task 2 and 3: Count and find indexes of "Java"
		        for (int i = 0; i < words.length; i++) {
		            // Remove punctuation like '.' or ',' from word
		            String cleanedWord = words[i].replaceAll("[^a-zA-Z]", "");

		            if (cleanedWord.equals("Java")) {
		                count++;
		                indexes.add(i);
		            }
		        }

		        // Output
		        System.out.println("Total number of words: " + words.length);
		        System.out.println("Total occurrences of 'Java': " + count);
		        System.out.println("Indexes of 'Java' in the paragraph: " + indexes);
		    }
	

	

}
