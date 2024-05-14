import java.util.Scanner;

public class question20 {
    Scanner scanner = new Scanner(System.in);
    String word;
    String result;
    boolean isPalindrome;

    public void checkIfStringIsAPalindrome() {
        System.out.println("Word palindrome checker.");
        System.out.print("Enter a word you want to check: ");
        word = scanner.next();

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
            isPalindrome = true;
        }
        if (isPalindrome) {
            System.out.println("The string is a palindrome");
        }else {
            System.out.println("The sting isn't a palindrome");
        }
    }

}
