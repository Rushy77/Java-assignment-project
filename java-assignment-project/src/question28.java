import java.util.Arrays;
import java.util.Scanner;

public class question28 {
    Scanner scanner = new Scanner(System.in);
    String[] array;
    int arraySize;

    public void selectionSort() {
        System.out.println("Selection Sorting Arrays");
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
            int minIndex = i;

            for (int j = i + 1; j < arraySize; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            String temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        System.out.println("Selection Sorted Array: " + Arrays.toString(array));
    }
}
