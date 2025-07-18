package InterviewQuestions;

public class SwapTwoString {
    public static void main(String[] args) {
        String str1 = "neha";
        String str2 = "arun";
        String temp;
        System.out.println("Before String 1 =:" + str1);
        System.out.println("Before String 2=:" + str2);
        temp = str1;
        str1=str2;
        str2=temp;
        System.out.println("After String 1 =:" + str1);
        System.out.println("After String 2=:" + str2);
    }
}
