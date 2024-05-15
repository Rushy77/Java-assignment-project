import java.util.Scanner;

public class question22 {
    Scanner scanner = new Scanner(System.in);
    String word;
    String result;

    public void reverseString() {
        System.out.println("Word Reverser");
        while (true) {
            System.out.print("Enter a word: ");
            word = scanner.next().trim();
            if (word.isEmpty()) {
                scanner.nextLine();
                System.out.println("Enter a valid word");
            }else {
                break;
            }
        }
        char[] charArray = word.toCharArray();

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }

        result = new String(charArray);

        System.out.println("Word: " + word);
        System.out.println("Reversed word: " + result);
    }
}
