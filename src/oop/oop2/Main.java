package oop.oop2;

class Calculator {
    int num1;
    int num2;

    Calculator (int a, int b) {
        num1 = a;
        num2 = b;
        System.out.println(num1 + num2);
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator(5,8);

        System.out.println(calc);
    }
}
