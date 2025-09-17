
public class Factory {
    public static void main(String[] args) {


    }
}
import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();
        // Normalize input (remove spaces, lowercase)
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        if (cleaned.equals(reversed)) {
            System.out.println(input + " is a palindrome!");
        } else {
            System.out.println(input + " is NOT a palindrome.");
        }
    }
}



import java.util.*;
public class WordFrequency {
    public static void main(String[] args) {
        String text = "Java is great and Java is powerful";
        // Split text into words (ignore case, remove punctuation)
        String[] words = text.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");
        // Use HashMap to store frequencies
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        // Print results
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}