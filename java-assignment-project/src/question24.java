import java.util.Objects;
import java.util.Scanner;

public class question24 {
    Scanner scanner = new Scanner(System.in);
    String[] array;
    int arraySize;
    String  target;
    int index;

    public void linearSearch() {
        System.out.println("Array Linear Search");
        while (true) {
            System.out.print("Enter the number of elements for the array: ");
            if (scanner.hasNextInt()){
                arraySize = scanner.nextInt();
                array = new String[arraySize];
                break;
            }else {
                scanner.nextLine();
                System.out.println("Enter a valid number");
            }
        }
        for (int i = 0; i < arraySize; i++) {
            while (true) {
                System.out.print("Enter the elements: ");
                if (scanner.hasNext()){
                    array[i] = scanner.next().trim();
                    break;
                }else {
                    scanner.nextLine();
                    System.out.println("Enter a valid element");
                }
            }
        }
        while (true) {
            System.out.print("Enter the target element from the array to find its index: ");
            if (scanner.hasNext()){
                target = scanner.next().trim();
                break;
            }else {
                scanner.nextLine();
                System.out.println("Enter a valid number");
            }
        }

        for (int i = 0; i < arraySize; i++) {
            if (Objects.equals(array[i], target)) {
                index = i;
                break;
            }
            index = -1;
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
