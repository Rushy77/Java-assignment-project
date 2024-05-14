import java.util.Scanner;

public class question8 {
    Scanner scanner = new Scanner(System.in);
    int numRows;

    public void generatingPascalTriangle() {
        System.out.println("Pascal Triangle Generator.");
        while (true) {
            System.out.print("Enter the power of the equation: ");
            if (scanner.hasNextInt()){
                numRows = scanner.nextInt() + 1;
                break;
            }else {
                scanner.nextLine();
                System.out.println("Enter a valid integer");
            }
        }
        for (int i = 0; i < numRows; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
