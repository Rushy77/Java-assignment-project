import java.util.Scanner;

public class question4 {
    Scanner scanner = new Scanner(System.in);
    int choice;
    int a = 0;
    String binary;
    String resultBinary = "";
    int resultInteger;

    public void binaryAndIntegerConversionSystem() {
        System.out.println("Integer-Binary and vice-versa conversions.");
        while (true) {
            System.out.print("Do you want to convert from integer to binary (1) or binary to integer (2)? ");
            if (scanner.hasNextInt()){
                choice = scanner.nextInt();
                break;
            }else {
                scanner.nextLine();
                System.out.println("Enter 1 or 2");
            }
        }
        if (choice == 1) {
            while (true) {
                System.out.print("Enter integer: ");
                if (scanner.hasNextInt()){
                    a = scanner.nextInt();
                    break;
                }else {
                    scanner.nextLine();
                    System.out.println("Enter a valid integer");
                }
                if (a == 0) {
                    resultBinary = "0";
                }
                while (a != 0) {
                    resultBinary = (a & 1) + resultBinary;
                    a >>= 1;
                }

                System.out.println("The binary value for this number is: " + resultBinary);
            }
        }
        if (choice == 2) {
            while (true) {
                System.out.print("Enter a binary number: ");
                if (scanner.hasNextInt()){
                    binary = scanner.nextLine();
                    break;
                }else {
                    scanner.nextLine();
                    System.out.println("Enter a valid binary number");
                }
            }
            for (int i = 0; i < binary.length(); i++){
                int digit = binary.charAt(i) - '0';

                resultInteger = (resultInteger << 1) + digit;
            }
            System.out.println("The integer value for this binary number is: " + resultInteger);
        }
    }
}
