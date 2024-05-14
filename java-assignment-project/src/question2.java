import java.util.Scanner;

public class question2 {
    Scanner scanner = new Scanner(System.in);
    int a = 0;
    int b = 0;

    public int addInts() {
        System.out.println("Addition of two integers");
        while (true) {
            System.out.print("Enter the first number: ");
            if (scanner.hasNextInt()){
                a = scanner.nextInt();
                break;
            }else {
                scanner.nextLine();
                System.out.println("Enter a valid integer");
            }
        }

        while (true) {
            System.out.print("Enter the second number: ");
            if (scanner.hasNextInt()){
                b = scanner.nextInt();
                break;
            }else {
                scanner.nextLine();
                System.out.println("Enter a valid integer");
            }
        }
        return (a + b);
    }
}
