package PolishCalc;

import java.util.Stack;

public class Calculator {

    /**
     * @param x
     * makes sure it is between 0 - 9
     */
    public static boolean isOperand(char x) {
        //making sure operands are between 0 and 9 (ASCII)
        return x >= 48 && x <= 57;
    }

    /**
     * @param expression
     * keeps track of the operators and operands through a stack
     * every time operator is encountered, pops 2 operands and evaluates
     * then pushes the result back onto the stack
     */
    public static double evaluate(String expression) {
        Stack<Double> stack = new Stack<>();

        for (int currOp = expression.length() - 1; currOp >= 0; currOp--) {
            if (isOperand(expression.charAt(currOp))) {
                //convert to double - 0
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
                        stack.push(op1 / op2);
                        break;
                }
            }
        }
        return stack.peek();
    }
}

