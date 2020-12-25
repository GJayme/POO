package EAD.Generics.basket;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class ListBasket<E> implements Basket<E>{

    private List<E> list;

    public ListBasket() {
        list = new ArrayList<>();
    }

    @Override
    public void put(E item) {
        list.add(item);
    }

    @Override
    public E next() {
        Random r = new Random(System.currentTimeMillis());
        int index = Math.abs(r.nextInt() % (list.size()));
        return list.remove(index);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void addAll(Collection<? extends E> collection) {
        for(E item : collection) {
            put(item);
        }
    }

    @Override
    public void getAll(Collection<? super E> collection) {
        while (!isEmpty()) {
            collection.add(next());
        }
    }
}
