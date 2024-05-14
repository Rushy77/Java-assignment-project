import java.util.Arrays;
import java.util.Scanner;

public class question19 {
    Scanner scanner = new Scanner(System.in);
    int[] array;
    int arraySize;
    int key;
    int[] result;

    public void deletingSelectedOccurrenceInArrays() {
        System.out.println("Delete a selected occurrence in an array");
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
        int count = 0;
        for (int i = 0; i < arraySize; i++) {
            if (array[i] == key) {
                count++;
            }
        }

        result = new int[arraySize - count];
        int index = 0;

        for (int i = 0; i < arraySize; i++) {
            if (array[i] != key) {
                result[index++] = array[i];
            }
        }

        System.out.println("Array after removing all occurrences of " + key + ": " + Arrays.toString(result));
    }
}
