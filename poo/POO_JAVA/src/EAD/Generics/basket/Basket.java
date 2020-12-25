package EAD.Generics.basket;

import java.util.Collection;

public interface Basket<E> {

    public void put(E item);

    public E next();

    public boolean isEmpty();

    public void addAll(Collection<? extends E> collection);

    public void getAll(Collection<? super E> collection);
}
