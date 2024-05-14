import java.util.Scanner;

public class question14 {
    Scanner scanner = new Scanner(System.in);
    int[] array;
    int arraySize;
    int sum;

    public void additionOfElementsInArrays() {
        System.out.println("Addition of elements in an array");
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

        for (int j : array) {
            sum += j;
        }

        System.out.println("Sum of array elements: " + sum);
    }
}
