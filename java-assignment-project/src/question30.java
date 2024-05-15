import java.util.Arrays;
import java.util.Scanner;

public class question30 {
    Scanner scanner = new Scanner(System.in);
    String[] array;
    int arraySize;

    public void quickSortIOMeth() {
        System.out.println("Quick Sorting Arrays");
        while (true) {
            System.out.print("Enter the number of elements for the array: ");
            if (scanner.hasNextInt()) {
                arraySize = scanner.nextInt();
                this.array = new String[arraySize];
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
                    this.array[i] = scanner.next().trim();
                    break;
                } else {
                    scanner.nextLine();
                    System.out.println("Enter a valid element");
                }
            }
        }

        System.out.println("Original Array: " + Arrays.toString(array));

        quickSort(array, 0, arraySize - 1);

        System.out.println("Quick Sorted Array: " + Arrays.toString(array));
    }

    public void quickSort(String[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);

            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    private int partition(String[] array, int low, int high) {
        String pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j].compareTo(pivot) < 0) {
                i++;

                String temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        String temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}
