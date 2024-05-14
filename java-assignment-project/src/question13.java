import java.util.Scanner;

public class question13 {
    Scanner scanner = new Scanner(System.in);
    int numRows;

    public void generateDiamondPattern() {
        System.out.println("Diamond Pattern Generator.");
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

        // loop to handle lower part
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // loop to handle lower part
        for (int i = numRows-1; i >= 1; i--) {
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
