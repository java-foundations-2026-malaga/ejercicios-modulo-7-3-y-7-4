package modulo7_3_7_4_actividad05;

public class Actividad05 {
    static class Calculator {
        int sum(int a, int b) {
            return (int) (a + b);
        }

        double sum(double first, double second) {
            return first + second;
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Enteros: "+calculator.sum(3, 4)+"\nDecimales: "+calculator.sum(3.5, 4.0));
    }
}
