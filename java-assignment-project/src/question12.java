import java.util.Scanner;

public class question12 {
    Scanner scanner = new Scanner(System.in);
    int numRows;

    public void generatePalindromeTriangle() {
        System.out.println("Palindrome Triangle Generator.");
        while (true) {
            System.out.print("Enter the number or rows: ");
            if (scanner.hasNextInt()){
                numRows = scanner.nextInt();
                break;
            }else {
                scanner.nextLine();
                System.out.println("Enter a valid number");
            }
        }
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= 2 * (numRows - i); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
