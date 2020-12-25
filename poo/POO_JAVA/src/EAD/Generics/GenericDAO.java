package EAD.Generics;

import java.util.List;

public interface GenericDAO<T, K> {

    boolean insert(T object);
    T findOne(K key);
    List<T> findAll();
    boolean remove(K key);
}
