package C02_firstProgram;

import java.util.Scanner;

public class P2_greetings {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = inp.next();
        greet(name);

    }
    static void greet(String name){
        System.out.println("Hello " + name);
    }
}
