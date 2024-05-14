import java.util.Scanner;

public class question5 {
    Scanner scanner = new Scanner(System.in);
    int number;
    int factorial = 1;

    public void factorialOfNumber() {
        System.out.println("Find the factorial of a number.");
        while (true) {
            System.out.print("Enter number: ");
            if (scanner.hasNextInt()){
                number = scanner.nextInt();
                break;
            }else {
                scanner.nextLine();
                System.out.println("Enter a valid number");
            }
        }
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + number + " is " + factorial);
    }
}
