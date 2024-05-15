import java.util.Arrays;
import java.util.Scanner;

public class question21 {
    Scanner scanner = new Scanner(System.in);
    String word1;
    String word2;
    boolean isAnagram;

    public void checkIfStringIsAnagram() {
        System.out.println("Word Anagram Checker");
        while (true) {
            System.out.print("Enter the first word: ");
            word1 = scanner.next().trim();
            if (word1.isEmpty()) {
                scanner.nextLine();
                System.out.println("Enter a valid word");
            }else {
                break;
            }
        }
        while (true){
            System.out.print("Enter the second word: ");
            word2 = scanner.next();
            if (word2.isEmpty()){
                scanner.nextLine();
                System.out.println("Enter a valid word");
            }else {
                break;
            }
        }

        word1 = word1.replaceAll("\\s", "").toLowerCase();
        word2 = word2.replaceAll("\\s", "").toLowerCase();

        if (word1.length() != word2.length()){
            isAnagram = false;
        }

        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        isAnagram = Arrays.equals(charArray1, charArray2);

        if (isAnagram){
            System.out.println("Words are Anagram");
        }else {
            System.out.println("Words aren't Anagram");
        }

    }
}
