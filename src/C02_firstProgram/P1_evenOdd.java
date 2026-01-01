package C02_firstProgram;
// Write a program to print whether a number is even or odd,
// also take input from the user.

import java.util.Scanner;

public class P1_evenOdd {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int num = inp.nextInt();
        if(oddOrEven(num)){
            System.out.println("It is an even number");
        }
        else{
            System.out.println("It is an odd number");
        }
    }
    static boolean oddOrEven(int num){
        return num % 2 == 0;
    }
}
