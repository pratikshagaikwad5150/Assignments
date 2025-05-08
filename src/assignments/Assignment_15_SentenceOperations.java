package assignments;

public class Assignment_15_SentenceOperations {

	public static void main(String[] args) {
		
        String sentence = "Java programming is fun and challenging";

        // Task 1: Count total number of words
        
        
        String[] words = sentence.split(" ");
        int wordCount = words.length;
        System.out.println("Total number of words: " + wordCount);

        //Task 2: Print sentence words in reverse order
        System.out.print("Sentence in reverse word order: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i > 0) System.out.print(" ");
        }
        System.out.println();

        // Task 3: Capitalize first character of each word and print original sentence
        StringBuilder capitalizedSentence = new StringBuilder();
        for (String word : words) {
            capitalizedSentence.append(Character.toUpperCase(word.charAt(0)))
                               .append(word.substring(1))
                               .append(" ");
        }
        System.out.println("Sentence with capitalized words: " + capitalizedSentence.toString().trim());
    }
}



