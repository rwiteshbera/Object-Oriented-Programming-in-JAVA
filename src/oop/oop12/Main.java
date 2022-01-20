package oop.oop12;

public class Main {
    public static void main(String[] args) throws Exception {
            int a = 5;
            int b = 0;

            try {
                divide(a,b);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Final Message");
            }
    }

    static int divide (int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Please don't divide by zero.");
        }

        return a / b;
    }
}
