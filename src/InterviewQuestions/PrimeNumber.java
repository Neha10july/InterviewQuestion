package InterviewQuestions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number=: ");
        int num = input.nextInt();
        boolean flag = false;
        for (int i = 2; i < num ; i++) {
            if (num%i==0){
                flag = true;
                break;
            }
        }
        if (flag==true){
            System.out.println("This is not prime number.");
        }
        else {
            System.out.println("This is prime number");
        }
    }
}

