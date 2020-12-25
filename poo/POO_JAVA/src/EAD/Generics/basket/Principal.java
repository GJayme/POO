package EAD.Generics.basket;

import java.util.HashSet;
import java.util.Set;

public class Principal {

    public static void main(String[] args) {
        Basket<Fruit> basket = new ListBasket<>();
        basket.put(new Fruit("Goiaba"));
        basket.put(new TropicalFruit("Maracujá"));
        basket.put(new Fruit("Mamão"));
        basket.put(new Fruit("Morango"));
        basket.put(new TropicalFruit("Banana"));
        basket.put(new Fruit("Laranja"));
        basket.put(new Fruit("Melão"));
        basket.put(new Fruit("Uva"));
        basket.put(new Fruit("Pêssego"));

        Set<TropicalFruit> set = new HashSet<>();
        set.add(new TropicalFruit("Cupuaçu"));
        set.add(new TropicalFruit("Açao"));
        set.add(new TropicalFruit("Bacuri"));

        Set<Vegetable> veg = new HashSet<>();

        basket.addAll(set);

        System.out.println("Tirando 5 da cesta: ");
        for(int i = 0; i < 5; i++){
            System.out.println(basket.next());
        }
        System.out.println("---------------------");

        basket.getAll(veg);

        System.out.println(veg);
    }
}
