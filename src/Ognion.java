public class Ognion extends Ingredient{ // decoratuer concret

    public Ognion(Plat p)
    {
        this.sur = p;
    }

    @Override
    public double getPrix() {
        return this.sur.getPrix() + extra();
    }
    public double extra() {
        return 3.0;
    }
}
