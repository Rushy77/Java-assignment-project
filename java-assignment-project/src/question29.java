import java.util.Arrays;
import java.util.Scanner;

public class question29 {
    Scanner scanner = new Scanner(System.in);
    String[] array;
    int arraySize;

    public void mergeSortIOMeth() {
        System.out.println("Merge Sorting Arrays");
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

        System.out.println("Original Array: " + Arrays.toString(this.array));

        mergeSort(array, 0, arraySize - 1);

        System.out.println("Merge Sorted Array: " + Arrays.toString(array));
    }
    public void mergeSort(String[] array, int left, int right) {

        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            merge(this.array, left, mid, right);
        }
    }

    public void merge(String[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        String[] L = new String[n1];
        String[] R = new String[n2];

        System.arraycopy(array, left, L, 0, n1);
        for (int j = 0; j < n2; ++j) {
            R[j] = array[mid + 1 + j];
        }

        int i = 0, j = 0;

        int k = left;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }
}
