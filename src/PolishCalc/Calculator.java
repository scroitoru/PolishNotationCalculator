package PolishCalc;

import java.util.Stack;

public class Calculator {

    /**
     * @param expression
     * pointer currOp keeps track of the operators and operands through a stack
     * every time operator is encountered, pops 2 operands and evaluates
     */
    public static double calculate(String expression) {
        Stack<Double> stack = new Stack<>();

        for (int currOp = expression.length() - 1; currOp >= 0; currOp--) {
            if (isValidDigit(expression.charAt(currOp))) {
                //convert to double (- 0) and push onto stack
                stack.push((double) (expression.charAt(currOp) - 48));
            } else {
                //encountered operator, so pops two operands from stack to evaluate
                double op1 = stack.peek();
                stack.pop();
                double op2 = stack.peek();
                stack.pop();

                switch (expression.charAt(currOp)) {
                    case '+':
                        stack.push(op1 + op2);
                        break;
                    case '-':
                        stack.push(op1 - op2);
                        break;
                    case '*':
                        stack.push(op1 * op2);
                        break;
                    case '/':
                        if (op1 == 0){
                            throw new UnsupportedOperationException("cannot divide by zero");
                        }
                        stack.push(op1 / op2);
                        break;
                }
            }
        }
        return stack.pop();
    }

    /**
     * @param x
     * makes sure it is between 0 - 9
     */
    public static boolean isValidDigit(char x) {
        return x >= 48 && x <= 57;
    }
    
}