package modulo7_3_7_4_actividad10;

class Prisoner {
	String name;
	double height;
	int sentence;
	Prisoner(String name, double height, int sentence) {
        this.name = name;
        this.height = height;
        this.sentence = sentence;
    }
}
public class Actividad10 {
    public static void main(String[] args) {
        // TODO: usa this en Prisoner.
    	Prisoner Twitch = new Prisoner("Twitch", 1.68, 3);
    	System.out.println(Twitch.name+": "+Twitch.height+", "+Twitch.sentence);
    	//Crea el preso Twitch (1.68, 3) e imprime sus datos con el formato nombre: altura, condena.
    }
}
