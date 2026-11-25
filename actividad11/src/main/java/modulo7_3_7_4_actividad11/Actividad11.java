package modulo7_3_7_4_actividad11;

class Prisoner {
	String name;
	double height;
	int sentence;
	Prisoner(String name, double height, int sentence) {
        this.name = name;
        this.height = height;
        this.sentence = sentence;
    }
	Prisoner() {
		
	}
}

public class Actividad11 {
    public static void main(String[] args) {
        // TODO: sobrecarga el constructor.
    	Prisoner psn01 = new Prisoner("Bubba", 1.75, 4);
    	Prisoner psn02 = new Prisoner();
    	System.out.println("Por defecto: "+psn02.name+", "+psn02.height+", "+psn02.sentence+"\nCompleto: "+psn01.name+", "+psn01.height+", "+psn01.sentence);
    }
}
