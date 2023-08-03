// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Plat p1 = new PizzaBase();
    System.out.println("Pizza de base = " + p1.getPrix());
    Plat p2 = new Oeuf(new PizzaBase());
    System.out.println("Pizza avec oeufs = " + p2.getPrix());
    Plat p3 = new Ognion(new Oeuf(new PizzaBase()));
    System.out.println("Pizza avec oeufs = " + p3.getPrix());

    }
}