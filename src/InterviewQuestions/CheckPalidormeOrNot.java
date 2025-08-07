package InterviewQuestions;

import java.util.Scanner;

public class CheckPalidormeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the string=: ");
        String str = input.nextLine();

        boolean is_palidorme = true;
        for (int i = 0; i <str.length() / 2  ; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1 -i)){
                is_palidorme = false;
                break;
            }

        }
        if(is_palidorme){
            System.out.println("Palidorme String :" + str);
        }
        else {
            System.out.println("Not palidorme String :" + str);
        }
    }
}
