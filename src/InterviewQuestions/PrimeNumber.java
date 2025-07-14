package InterviewQuestions;

public class PrimeNumber {
    public static void main(String[] args) {
        int num=16;
        boolean flag=false;
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                flag=true;
                break;
            }
        }
        if(flag==true){
            System.out.println("Number is not prime");
        }
        else{
            System.out.println("Number is prime");
        }
    }
}

