import java.util.Arrays;
import java.util.Scanner;

public class question26 {
    Scanner scanner = new Scanner(System.in);
    String[] array;
    int arraySize;
    boolean swapped;

    public void bubbleSort() {
        System.out.println("Bubble Sorting Arrays");
        while (true) {
            System.out.print("Enter the number of elements for the array: ");
            if (scanner.hasNextInt()) {
                arraySize = scanner.nextInt();
                array = new String[arraySize];
                break;
            } else {
                scanner.nextLine();
                System.out.println("Enter a valid number");
            }
        }
        for (int i = 0; i < arraySize; i++) {
            while (true) {
                System.out.print("Enter the elements: ");
                if (scanner.hasNext()) {
                    array[i] = scanner.next().trim();
                    break;
                } else {
                    scanner.nextLine();
                    System.out.println("Enter a valid element");
                }
            }
        }

        System.out.println("Original Array: " + Arrays.toString(array));

        for (int i = 0; i < arraySize - 1; i++) {
            swapped = false;

            for (int j = 0; j < arraySize - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }

        System.out.println("Bubble sorted array: " + Arrays.toString(array));
    }
}
