import java.util.Scanner;

public class question9 {
    Scanner scanner = new Scanner(System.in);
    int n;
    long sum;
    long fib1 = 0;
    long fib2 = 1;

    public void sumOfFibonacciSeries() {
        while (true) {
            System.out.print("Enter the value of n: ");
            if (scanner.hasNextInt()){
                n = scanner.nextInt();
                break;
            }else {
                scanner.nextLine();
                System.out.println("Enter a valid integer n");
            }
        }
        for (int i = 1; i <= n; i++) {
            long fibonacci = fib1 + fib2;
            if (i % 2 == 0) {
                sum += fibonacci;
            }
            fib1 = fib2;
            fib2 = fibonacci;
        }
        System.out.println("Sum of Fibonacci series numbers at even indexes: " + sum);
    }
}
