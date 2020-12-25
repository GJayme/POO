package exercises.list05;

import java.util.List;

public interface GenericDAO<T, K> {

    boolean insert(T object);
    T findOne(K key);
    List<T> findAll();
    boolean update(T object);
    boolean remove(K key);

}
