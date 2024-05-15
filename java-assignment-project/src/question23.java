import java.util.Scanner;

public class question23 {
    Scanner scanner = new Scanner(System.in);
    int number;
    String str;
    String result;

    public void leadingZeroRemoval() {
        while (true){
            System.out.println("Leading Zero Remover");
            System.out.print("Enter a number you want to remove its leading zeros: ");
            if (scanner.hasNextInt()){
                number = scanner.nextInt();
                break;
            }else {
                scanner.nextLine();
                System.out.println("Enter a valid number");
            }
        }

        str = String.valueOf(number);

        int index = 0;
        while (index < str.length() && str.charAt(index) == '0'){
            index++;
        }

        result = str.substring(index);

        System.out.println("Number: " + number);
        System.out.println("Number after removing leading zeros: " + result);
    }
}
