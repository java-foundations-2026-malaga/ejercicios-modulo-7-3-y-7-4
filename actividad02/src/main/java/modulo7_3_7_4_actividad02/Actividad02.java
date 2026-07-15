package modulo7_3_7_4_actividad02;

public class Actividad02 {
  static class Product {
    String name;
    double price;

    Producto(String name, double price) {
      this.name = name;
      this.price = price;
    }
  }

  public static void main(String[] args) {
    Product product = new Product("Teclado", 29.99);
    System.out.println(product.name + ": " + product.price);
  }
}
