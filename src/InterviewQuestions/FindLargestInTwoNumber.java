package InterviewQuestions;

import java.util.Scanner;

public class FindLargestInTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number 1 =");
        int num1 = input.nextInt();

        System.out.println("Enter the number 2 =");
        int num2 = input.nextInt();

        int largest = (num1>num2) ? num1:num2;
        System.out.println("Largest number is :" + largest);

        int largest1 = Math.max(num1,num2);
        System.out.println("Largest number is :" +largest1);
    }
}
