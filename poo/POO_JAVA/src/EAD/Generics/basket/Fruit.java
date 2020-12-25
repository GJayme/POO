package EAD.Generics.basket;

public class Fruit extends Vegetable{

    public Fruit(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Fruit: "+name;
    }
}
