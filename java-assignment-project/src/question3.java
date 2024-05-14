import java.util.Scanner;

public class question3 {
    Scanner scanner = new Scanner(System.in);
    int a = 0;
    int b = 0;
    public void swapTwoNo() {
        System.out.println("Enter two numbers and watch them get swapped");
        while (true) {
            System.out.print("Enter a: ");
            if (scanner.hasNextInt()){
                a = scanner.nextInt();
                break;
            }else {
                scanner.nextLine();
                System.out.println("Enter a valid integer a");
            }
        }
        while (true) {
            System.out.print("Enter b: ");
            if (scanner.hasNextInt()){
                b = scanner.nextInt();
                break;
            }else {
                scanner.nextLine();
                System.out.println("Enter a valid integer b");
            }
        }

        System.out.println("a: " + b + " and " + "b: " + a);
    }
}
