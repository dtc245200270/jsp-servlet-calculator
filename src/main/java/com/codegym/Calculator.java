package com.codegym;

public class Calculator {
    public static float calculate(float firstOperand, float secondOperand, char operator) {
        switch (operator) {
            case '+':
                return firstOperand + secondOperand;
            case '-':
                return firstOperand - secondOperand;
            case '*':
                return firstOperand * secondOperand;
            case '/':
                if (secondOperand != 0) {
                    return firstOperand / secondOperand;
                } else {
                    throw new ArithmeticException("Không thể chia cho 0 (Divide by zero)");
                }
            default:
                throw new IllegalArgumentException("Toán tử không hợp lệ");
        }
    }
}
