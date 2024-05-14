import java.util.Scanner;

public class question10 {
    Scanner scanner = new Scanner(System.in);
    int numRows;

    public void generatePyramid(){
        System.out.println("Pyramid Generator.");
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
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
