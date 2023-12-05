package ru.calculator.calculator;

@org.springframework.stereotype.Service
public class Service {
    public double plus(double num1, double num2) {
        return num1 + num2;
    }

    public double minus(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public double division(double num1, double num2) {
        if (num2 == 0) {
            throw new RuntimeException("На ноль делить нельзя!");
        }
        return num1 / num2;
    }

    public String printPlus(double num1, double num2) {
        return num1 + " + " + num2 + " = " + plus(num1, num2);
    }
    public String printMinus(double num1, double num2) {
        return num1 + " - " + num2 + " = " + minus(num1, num2);
    }
    public String printMultiplication(double num1, double num2) {
        return num1 + " * " + num2 + " = " + multiplication(num1, num2);
    }
    public String printDivision(double num1, double num2) {
        return num1 + " / " + num2 + " = " + division(num1, num2);
    }

}
