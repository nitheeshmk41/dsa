package C02_firstProgram;

import java.util.Scanner;

public class P4_operations {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        char op = inp.next().charAt(0);

        doOperation(a,b,op);
    }
    static void doOperation(int x,int y, char op){
        if(op == '+'){
            System.out.println("Sum is : " + (x+y));
        } else if (op == '-') {
            System.out.println("Sum is : " + (x-y));
        } else if (op == '*') {
            System.out.println("Sum is : " + (x*y));
        } else if (op == '/') {
            System.out.println("Sum is : " + (x/y));
        } else{
            System.out.println("Enter valid inputs");
        }
    }
}
