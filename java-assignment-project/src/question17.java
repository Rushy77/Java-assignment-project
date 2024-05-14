import java.util.Scanner;

public class question17 {
    Scanner scanner = new Scanner(System.in);
    int[] array;
    int arraySize;
    int d;

    public void rotationOfArrays() {
        System.out.println("Array Rotation.");
        while (true) {
            System.out.print("Enter the number of elements for the array: ");
            if (scanner.hasNextInt()){
                arraySize = scanner.nextInt();
                array = new int[arraySize];
                break;
            }else {
                scanner.nextLine();
                System.out.println("Enter a valid number");
            }
        }
        for (int i = 0; i < arraySize; i++) {
            while (true) {
                System.out.print("Enter the elements: ");
                if (scanner.hasNextInt()){
                    array[i] = scanner.nextInt();
                    break;
                }else {
                    scanner.nextLine();
                    System.out.println("Enter a valid number");
                }
            }
        }
        while (true) {
            System.out.print("Enter the position to rotate (eg 1): ");
            if (scanner.hasNextInt()){
                d = scanner.nextInt();
                break;
            }else {
                scanner.nextLine();
                System.out.println("Enter a valid number");
            }
        }
        int n = arraySize;
        int[] temp = new int[d];

        System.arraycopy(array, 0, temp, 0, d);

        for (int i = d; i < n; i++) {
            array[i - d] = array[i];
        }

        System.arraycopy(temp, 0, array, n - d, d);

        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
