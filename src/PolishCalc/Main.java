package PolishCalc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("POLISH NOTATION CALCULATOR:\n" +
                "Prefix notation only, no spaces. \n" +
                "Characters may be entered with the desired number following each character (ex: +x2y3)");

        while (true) {
            try {
                System.out.println("\nPlease enter the prefix expression you would like evaluated (NO SPACES)\n" +
                        "or type 'end' to exit: ");
                String expression = sc.next();
                if (expression.equals("end")){
                    System.out.println("Sorry to see you go, goodbye.");
                    System.exit(0);
                }
                String converted = Calculator.convertToNums(expression);
                System.out.println("="+Calculator.calculate(converted));
            }catch (Exception e){
                System.out.println("invalid due to exception: " + e);
                System.out.println("Goodbye");
                System.exit(-1);
            }
        }
    }
}