package C02_firstProgram;

import java.util.Scanner;

public class P9_armStrong {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();

        if(isArmStrong(num)){
            System.out.println("It is armstrong number");
        }
        else{
            System.out.println("It is not armstrong");
        }
    }
    static boolean isArmStrong(int num){
        int temp = num;
        int sum = 0;
        while(temp != 0){
            int ld = temp %10;
            sum += ld*ld*ld;
            temp /= 10;
        }

        return sum == num;
    }
}
