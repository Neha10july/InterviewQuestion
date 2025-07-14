package InterviewQuestions;

import java.util.Locale;
import java.util.Scanner;

public class CountVowelInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the String :");
        String str = input.nextLine();
        str = str.toLowerCase(Locale.ROOT);
        int count = 0;
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.println("Total numbrer of vowel in string = :" + count);
    }
}
