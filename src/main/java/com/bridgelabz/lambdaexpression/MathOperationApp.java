package com.bridgelabz.lambdaexpression;

@FunctionalInterface
interface IMathFunction {
    int calculate(int a, int b);
}

public class MathOperationApp {
    public static void main(String[] args) {
        IMathFunction add = Integer::sum;
        IMathFunction multiply = (a, b) -> a * b;
        IMathFunction divide = (int a, int b) -> a / b;
        IMathFunction subtract = (int a, int b) -> a - b;
        System.out.println("addition " + add.calculate(2, 3));
        System.out.println("multiplication " + multiply.calculate(2, 3));
        System.out.println("subtraction " + subtract.calculate(2, 3));
        System.out.println("division " + divide.calculate(4, 2));
    }
}
