package PolishCalc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("POLISH NOTATION CALCULATOR:\n" +
                "Prefix notation only, no spaces");
        while (true) {
            try {
                System.out.println("Please enter the prefix expression you would like evaluated (NO SPACES): ");
                String expression = sc.next();
                System.out.println(Calculator.evaluate(expression));
            }catch (Exception e){
                System.out.println("invalid due to exception: " + e);
                System.out.println("Goodbye");
                System.exit(-1);
            }
        }

    }
}
