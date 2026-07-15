package modulo7_3_7_4_actividad01;

public class Actividad01 {
  static class Prisoner {
    String name;
    double height;
    int sentence;

    public void Prisoner(String name, double height, int sentence) {
      this.name = name;
      this.height = height;
      this.sentence = sentence;
    }
  }

  public static void main(String[] args) {
    Prisoner prisoner = new Prisoner("Bubba", 1.75, 4);
    System.out.println(prisoner.name + ": " + prisoner.height + ", " + prisoner.sentence);
  }
}
