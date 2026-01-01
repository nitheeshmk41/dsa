package C02_firstProgram;

import java.util.Scanner;

// Take 2 numbers as input and print the largest number.
public class P5_largestNum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1 = inp.nextInt();
        int n2 = inp.nextInt();

        findLargest(n1,n2);
    }
    static void findLargest(int a, int b){
        if(a > b){
            System.out.println("A is largest");
        } else if (a == b) {
            System.out.println("Both are equal");
        } else{
            System.out.println("B is largest");
        }
    }
}
