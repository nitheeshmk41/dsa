package C02_firstProgram;

import java.util.Scanner;

public class P8_palindrome {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s1 = inp.next();
        String s2 = inp.next();

        if(isPalindrome(s1,s2)){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
    static boolean isPalindrome(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        int n = s1.length();

        for (int i = 0; i < n; i++) {
            if(s1.charAt(i) != s2.charAt(n - i - 1)){
                return false;
            }
        }
        return true;
    }
}
