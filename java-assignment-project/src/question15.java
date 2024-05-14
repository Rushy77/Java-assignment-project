import java.util.Scanner;

public class question15 {
    Scanner scanner = new Scanner(System.in);
    int[] array;
    int arraySize;


    public void largestNumberInArray() {
        System.out.println("Largest element in an array");
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

        int maxElement = array[0];
        for (int i = 1; i < arraySize; i++) {
            if (array[i] > maxElement)
                maxElement = array[i];
        }

        System.out.println("Largest number in the array: " + maxElement);
    }
}
