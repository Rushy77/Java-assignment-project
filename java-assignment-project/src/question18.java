import java.util.Arrays;
import java.util.Scanner;

public class question18 {
    Scanner scanner = new Scanner(System.in);
    int[] array;
    int arraySize;
    int[] result;

    public void deletingArrayDuplicates() {
        System.out.println("Duplicate deletion in an array");
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

        Arrays.sort(array);

        int n = arraySize;
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (array[i] != array[i + 1]) {
                array[j++] = array[i];
            }
        }

        array[j++] = array[n - 1];

        result = new int[j];
        System.arraycopy(array, 0, result, 0, j);

        System.out.println("Array without duplicates: " + Arrays.toString(result));
    }
}
