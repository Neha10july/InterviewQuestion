package InterviewQuestions;

import java.util.Scanner;

public class FindLowerAndUpperCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the String =: ");
        String str = "Welcome Java Automation";

        int lowercount = 0;
        int uppercount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                uppercount++;
            }
            else if(Character.isLowerCase(ch)){
                lowercount++;
            }
        }
        System.out.println("Upper char in the string : " + uppercount);
        System.out.println("Lower char in the string : " + lowercount);
    }
}
