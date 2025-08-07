package InterviewQuestions;

import java.util.Scanner;

public class RemoveDuplicateCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter duplicate character word =:");
        String str = input.nextLine();

        String output = "";

        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if(output.indexOf(ch)== -1){
                output = output + ch;
            }
        }
        System.out.println("Original String :" + input);
        System.out.println("Remove duplicate character string :" + output);
    }
}
