package modulo7_3_7_4_actividad14;

public class Actividad14 {
	
	static int sum (int num01, int num02) {
    	int suma = (num01+num02);
    	return suma;
    }
    static double sum (int num01, double num02) {
    	double suma = (num01+num02);
    	return suma;
    }
    static double sum (double num01, int num02) {
    	double suma = (num01+num02);
    	return suma;
    }
    static double sum (double num01, double num02) {
    	double suma = (num01+num02);
    	return suma;
    }
	
    public static void main(String[] args) {
        // TODO: sobrecarga sum por tipo y orden.
    	System.out.println("int,int: "+sum(3, 4)+"\ndouble,double: "+sum(3.5, 4.0)+"\nint,double: "+sum(3, 4.5)+"\ndouble,int: "+sum(3.5, 4));
    }
}
