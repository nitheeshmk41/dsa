package C02_firstProgram;

import java.util.Scanner;

// Input currency in rupees and output in USD.
public class P6_INRtoUSD {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        float inr = inp.nextFloat();
        inrToUsd(inr);
    }
    static void inrToUsd(float inr){
        System.out.println("INR "+ inr + " : " + Math.round((inr / 90)) + " USD");
    }
}
