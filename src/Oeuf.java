public class Oeuf extends Ingredient{ // decoratuer concret

    public Oeuf(Plat p)
    // new Oeuf(new PizzaBase)
    // new Ognion(new Oeuf(new PizzaBase))
    {
        this.sur = p;
    }

    @Override
    public double getPrix() {
        return this.sur.getPrix() + extra();
    }
    public double extra() {
        return 1.25;
    }
}
