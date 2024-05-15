import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int minQuesNo = 1;
        int maxQuesNo = 30;

        question1 question1 = new question1();
        question2 question2 = new question2();
        question3 question3 = new question3();
        question4 question4 = new question4();
        question5 question5 = new question5();
        question6 question6 = new question6();
        question7 question7 = new question7();
        question8 question8 = new question8();
        question9 question9 = new question9();
        question10 question10 = new question10();
        question11 question11 = new question11();
        question12 question12 = new question12();
        question13 question13 = new question13();
        question14 question14 = new question14();
        question15 question15 = new question15();
        question16 question16 = new question16();
        question17 question17 = new question17();
        question18 question18 = new question18();
        question19 question19 = new question19();
        question20 question20 = new question20();
        question21 question21 = new question21();
        question22 question22 = new question22();
        question23 question23 = new question23();
        question24 question24 = new question24();
        question25 question25 = new question25();
        question26 question26 = new question26();
        question27 question27 = new question27();
        question28 question28 = new question28();
        question29 question29 = new question29();
        question30 question30 = new question30();

        while (true) {
            System.out.print("Which solution do you wish to see, from Q1 to Q30 (Enter 1 for Q1): ");

            if (scanner.hasNextInt()){
                choice = scanner.nextInt();
                if (choice >= minQuesNo && choice <= maxQuesNo)
                    break;
            }else {
                scanner.nextLine();
            }
            System.out.println("Enter 1 for Q1, 2 for Q2 and so forth");
        }

        if (choice == 1)
            question1.printHelloWorld();
        if (choice == 2) {
            int result = question2.addInts();
            System.out.println("The answer is: " + result);
        }
        if (choice == 3)
            question3.swapTwoNo();
        if (choice == 4)
            question4.binaryAndIntegerConversionSystem();
        if (choice == 5)
            question5.factorialOfNumber();
        if (choice == 6)
            question6.additionOfComplexNumbers();
        if (choice == 7)
            question7.simpleInterestCalc();
        if (choice == 8)
            question8.generatingPascalTriangle();
        if (choice == 9)
            question9.sumOfFibonacciSeries();
        if (choice == 10)
            question10.generatePyramid();
        if (choice == 11)
            question11.squarePrintPatternGenerator();
        if (choice == 12)
            question12.generatePalindromeTriangle();
        if (choice == 13)
            question13.generateDiamondPattern();
        if (choice == 14)
            question14.additionOfElementsInArrays();
        if (choice == 15)
            question15.largestNumberInArray();
        if (choice == 16)
            question16.transposingMatrix();
        if (choice == 17)
            question17.rotationOfArrays();
        if (choice == 18)
            question18.deletingArrayDuplicates();
        if (choice == 19)
            question19.deletingSelectedOccurrenceInArrays();
        if (choice == 20)
            question20.checkIfStringIsAPalindrome();
        if (choice == 21)
            question21.checkIfStringIsAnagram();
        if (choice == 22)
            question22.reverseString();
        if (choice == 23)
            question23.leadingZeroRemoval();
        if (choice == 24)
            question24.linearSearch();
        if (choice == 25)
            question25.binarySearch();
        if (choice == 26)
            question26.bubbleSort();
        if (choice == 27)
            question27.insertionSort();
        if (choice == 28)
            question28.selectionSort();
        if (choice == 29)
            question29.mergeSortIOMeth();
        if (choice == 30)
            question30.quickSortIOMeth();
    }
}
