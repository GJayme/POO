package EAD.Generics.basket;

public class TropicalFruit extends Fruit{

    public TropicalFruit(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Tropical Fruit: "+ name + " brow!";
    }
}
