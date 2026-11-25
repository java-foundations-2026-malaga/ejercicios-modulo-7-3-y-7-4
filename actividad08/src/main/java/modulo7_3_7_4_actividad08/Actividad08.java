package modulo7_3_7_4_actividad08;
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
public class Actividad08 {
    public static void main(String[] args) {
        // TODO: crea el constructor y dos objetos.
    	Prisoner psn01 = new Prisoner("Bubba",1.75, 4);
    	Prisoner psn02 = new Prisoner("Twitch",1.68, 3);
    	System.out.println("Bubba: "+psn01.height+", "+psn01.sentence+"\nTwitch: "+psn02.height+", "+psn02.sentence);
    }
}
