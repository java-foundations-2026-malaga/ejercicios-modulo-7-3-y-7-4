package modulo7_3_7_4_actividad05;

public class Actividad05 {
    static class Calculator {
        int sum(double a, double b) {
            return (int) (a + b);
        }

        double sum(double first, double second) {
            return first + second;
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(3, 4));
    }
}
