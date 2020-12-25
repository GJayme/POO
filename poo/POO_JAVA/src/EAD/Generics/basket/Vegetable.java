package EAD.Generics.basket;

public class Vegetable {

    protected String name;

    public Vegetable(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vegetable: "+name;
    }

}
