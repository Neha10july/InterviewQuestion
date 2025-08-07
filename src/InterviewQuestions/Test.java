package InterviewQuestions;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter String = :");
        String str = input.nextLine();
        String [] word_count = str.trim().split("\\s+");
        System.out.println("Word in the string = " + word_count.length);

    }
}
