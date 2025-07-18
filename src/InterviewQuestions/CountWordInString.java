package InterviewQuestions;

import java.util.Scanner;

public class CountWordInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the String =:");
        String str = input.nextLine();

        String [] word = str.trim().split("\\s+");
        System.out.println("Word Count: " + word.length);
    }
}
