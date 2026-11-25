package modulo7_3_7_4_actividad12;

class Light {
	int brightness;
	String color;
	boolean on;
	Light(int brightness, String color, boolean on) {
		this.brightness = brightness;
		this.color = color;
		this.on = on;
	}
	Light(int brightness, String color) {
		this(brightness, color, false);
	}
}


public class Actividad12 {
    public static void main(String[] args) {
        // TODO: encadena constructores con this(...).
    	Light luz01 = new Light(50, "warm");
    	Light luz02 = new Light(80, "cool", true);
    	System.out.println("Luz 1: "+luz01.brightness+", "+luz01.color+", "+luz01.on+"\nLuz 2: "+luz02.brightness+", "+luz02.color+", "+luz02.on);
    }
}
