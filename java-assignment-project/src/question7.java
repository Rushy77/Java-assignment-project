import java.util.Scanner;

public class question7 {
    Scanner scanner = new Scanner(System.in);
    double principal;
    double rate;
    double time;

    public void simpleInterestCalc() {
        System.out.println("Calculate the S.I.");
        while (true) {
            System.out.print("Enter principal: ");
            if (scanner.hasNextDouble()){
                principal = scanner.nextDouble();
                break;
            }else {
                scanner.nextLine();
                System.out.println("Enter a valid principal");
            }
        }
        while (true) {
            System.out.print("Enter rate: ");
            if (scanner.hasNextDouble()){
                rate = scanner.nextDouble();
                break;
            }else {
                scanner.nextLine();
                System.out.println("Enter a valid rate");
            }
        }
        while (true) {
            System.out.print("Enter time (years): ");
            if (scanner.hasNextDouble()){
                time = scanner.nextDouble();
                break;
            }else {
                scanner.nextLine();
                System.out.println("Enter a valid time (years)");
            }
        }

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest: " + simpleInterest);
    }
}
