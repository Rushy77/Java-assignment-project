import java.util.Arrays;
import java.util.Scanner;

public class question25 {
    Scanner scanner = new Scanner(System.in);
    String[] array;
    int arraySize;
    String  target;
    int index;

    public void binarySearch() {
        System.out.println("Array Binary Search");
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

        Arrays.sort(array);

        int left = 0;
        int right = arraySize - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

           int comparison = target.compareTo(array[mid]);

           if (comparison == 0) {
               index = mid;
               break;
           }

           if (comparison > 0) {
               left = mid + 1;
           }else {
               right = mid - 1;
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
