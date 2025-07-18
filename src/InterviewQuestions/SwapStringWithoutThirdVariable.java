package InterviewQuestions;

import java.util.Scanner;

public class SwapStringWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter second string =");
        String str1 = input.nextLine();

        System.out.println("Enter first string =");
        String str2 = input.nextLine();

        System.out.println("Before swap:");
        System.out.println("String 1 = " + str1);
        System.out.println("String 2 = " + str2);

        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("After swap:");
        System.out.println("String 1 = " + str1);
        System.out.println("String 2 = " + str2);
    }
}
