package InterviewQuestions;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the String =:");
        String  str = input.nextLine();

        String reverse = "";
        for (int i = str.length()-1; i >=0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reverse);
    }
}
