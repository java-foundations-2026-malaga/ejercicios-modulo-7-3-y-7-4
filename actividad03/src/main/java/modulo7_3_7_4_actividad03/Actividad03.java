package modulo7_3_7_4_actividad03;

public class Actividad03 {
    static class Prisoner {
        String name;

        Prisoner(String name, double height, int sentence) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Prisoner prisoner = new Prisoner();
        System.out.println(prisoner.name);
    }
}
