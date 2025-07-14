package InterviewQuestions;

import java.util.Locale;

public class CheckVowelINStringorNot {
        public static void main(String[] args) {
            String str = "India is my country";
            boolean hasvowel = false;
            str = str.toLowerCase(Locale.ROOT);
            for (int i = 0; i < str.length() ; i++) {
                char ch = str.charAt(i);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    hasvowel = true;
                    break;
                }

            }
            if(hasvowel){
                System.out.println("vowel is present in string");
            }
            else {
                System.out.println("vowel is not present in string");
            }
        }
}
