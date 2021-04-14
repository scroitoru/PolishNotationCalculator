package PolishCalc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("POLISH NOTATION CALCULATOR:\n" +
                "Prefix notation only, no spaces. \n" +
                "(if extra operands or operators are entered, " +
                "they will be ignored and discarded.)");
        while (true) {
            try {
                System.out.println("\nPlease enter the prefix expression you would like evaluated (NO SPACES)\n" +
                        "or type 'end' to exit: ");
                String expression = sc.next();
                if (expression.equals("end")){
                    System.out.println("Sorry to see you go, goodbye.");
                    System.exit(0);
                }
                System.out.println(Calculator.calculate(expression));
            }catch (Exception e){
                System.out.println("invalid due to exception: " + e);
                System.out.println("Goodbye");
                System.exit(-1);
            }
        }
    }
}
