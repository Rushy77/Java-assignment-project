import java.util.Scanner;

public class question11 {
    Scanner scanner = new Scanner(System.in);
    int numRows;

    public void squarePrintPatternGenerator() {
        System.out.println("Square Generator.");
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
            if (i == 1 || i == numRows) {
                for (int j = 1; j <= numRows; j++) {
                    System.out.print("*  ");
                }
            } else {
                System.out.print("*  ");
                for (int j = 2; j < numRows; j++) {
                    System.out.print("   ");
                }
                System.out.print("*  ");
            }

            System.out.println();
        }
    }
}
