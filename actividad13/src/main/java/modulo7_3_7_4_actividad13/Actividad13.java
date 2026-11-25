package modulo7_3_7_4_actividad13;

public class Actividad13 {
	
	static int sum (int num01) {
    	int suma = num01;
    	return suma;
    }
    static int sum (int num01, int num02) {
    	int suma = sum(num01)+num02;
    	return suma;
    }
    static int sum (int num01, int num02, int num03) {
    	int suma = (sum(num01,num02)+num03);
    	return suma;
    }
    
    public static void main(String[] args) {
        // TODO: sobrecarga sum por número de parámetros.
    	System.out.println("Uno: "+ sum(5)+"\nDos: "+sum(4,5)+"\nTres: "+sum(3,4,5));
    }
    
}
