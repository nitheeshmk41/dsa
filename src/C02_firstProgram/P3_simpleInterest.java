package C02_firstProgram;

import java.util.Scanner;

public class P3_simpleInterest {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int p = inp.nextInt();
        int r = inp.nextInt();
        int t = inp.nextInt();

        System.out.println("SI is : " + SI(p,r,t));
    }
    static double SI(double p, double r, double t){
        return (p*r*t) / 100;
    }
}
