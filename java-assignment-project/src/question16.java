import java.util.Scanner;

public class question16 {
    Scanner scanner = new Scanner(System.in);
    int[][] matrix;
    int matrixNumRows;
    int matrixNumColumns;

    public void transposingMatrix() {
        System.out.println("Matrix Transposition");
        while (true) {
            System.out.print("Enter the number of rows of the matrix: ");
            if (scanner.hasNextInt()){
                matrixNumRows = scanner.nextInt();
                break;
            }else {
                scanner.nextLine();
                System.out.println("Enter a valid number");
            }
        }
        while (true) {
            System.out.print("Enter the number of columns of the matrix: ");
            if (scanner.hasNextInt()){
                matrixNumColumns = scanner.nextInt();
                break;
            }else {
                scanner.nextLine();
                System.out.println("Enter a valid number");
            }
        }
        matrix = new int[matrixNumRows][matrixNumColumns];
        for (int i = 0; i < matrixNumRows; i++) {
            for (int j = 0; j < matrixNumColumns; j++) {
                while (true) {
                    System.out.print("Enter the elements of the matrix: ");
                    if (scanner.hasNextInt()){
                        matrix[i][j] = scanner.nextInt();
                        break;
                    }else {
                        scanner.nextLine();
                        System.out.println("Enter a valid number");
                    }
                }
            }
        }
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpose of the matrix:");
        for (int[] ints : transpose) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
