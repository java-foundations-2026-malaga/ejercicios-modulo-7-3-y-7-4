package modulo7_3_7_4_actividad15;

class Prisoner {
	String name;
	double height;
	int sentence;
	Prisoner(String name, double height, int sentence) {
        this.name = name;
        this.height = height;
        this.sentence = sentence;
    }
	void think() {
		System.out.println(this.name+" está pensando");
	}
	void display() {
		System.out.println(this.name+": "+this.height+", "+this.sentence);
	}
	void display(boolean think) {
		System.out.println(this.name+": "+this.height+", "+this.sentence);
		if (think) think();
	}
}

public class Actividad15 {
    public static void main(String[] args) {
        // TODO: sobrecarga display.
    	Prisoner psn01 = new Prisoner("Bubba", 1.75, 4);
    	psn01.display();
    	psn01.display(true);
    }
}
