import java.util.Scanner;

public class question6 {
    Scanner scanner = new Scanner(System.in);
    int realNumber1;
    int realNumber2;
    int imaginaryNumber1;
    int imaginaryNumber2;

    public void additionOfComplexNumbers() {
        System.out.println("Addition of complex numbers.");
        while (true) {
            System.out.print("Enter coefficient of first real number: ");
            if (scanner.hasNextInt()){
                realNumber1 = scanner.nextInt();
                break;
            }else {
                scanner.nextLine();
                System.out.println("Enter a valid coefficient of first real number");
            }
        }
        while (true) {
            System.out.print("Enter coefficient of first imaginary number: ");
            if (scanner.hasNextInt()){
                imaginaryNumber1 = scanner.nextInt();
                break;
            }else {
                scanner.nextLine();
                System.out.println("Enter a valid coefficient of first imaginary number");
            }
        }
        while (true) {
            System.out.print("Enter coefficient of second real number: ");
            if (scanner.hasNextInt()){
                realNumber2 = scanner.nextInt();
                break;
            }else {
                scanner.nextLine();
                System.out.println("Enter a valid coefficient of second real number");
            }
        }
        while (true) {
            System.out.print("Enter coefficient of second imaginary number: ");
            if (scanner.hasNextInt()){
                imaginaryNumber2 = scanner.nextInt();
                break;
            }else {
                scanner.nextLine();
                System.out.println("Enter a valid coefficient of second imaginary number");
            }
        }

        int realNumber = realNumber1 + realNumber2;
        int imaginaryNumber = imaginaryNumber1 + imaginaryNumber2;

        System.out.println("Sum: " + realNumber + " + " + imaginaryNumber + "i");
    }
}
