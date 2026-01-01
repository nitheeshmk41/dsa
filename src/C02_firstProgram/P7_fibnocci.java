package C02_firstProgram;

import java.util.Scanner;

public class P7_fibnocci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        fib(n);
    }
    static void fib(int n){
        if(n == 1){
            System.out.println("0");
        } else if (n == 2) {
            System.out.println("0 1");
        } else{
            int n1 = 0;
            int n2 = 1;
            System.out.print("0 1");
            for(int i = 2 ; i < n; i++){
                int n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                System.out.print(" "+ n3);
            }
        }
    }
}
