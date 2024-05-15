import java.util.Arrays;
import java.util.Scanner;

public class question27 {
    Scanner scanner = new Scanner(System.in);
    String[] array;
    int arraySize;

    public void insertionSort() {
        System.out.println("Insertion Sorting Arrays");
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

        for (int i = 1; i < arraySize; i++) {
            String key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }

        System.out.println("Insertion Sorted Array: " + Arrays.toString(array));
    }
}
