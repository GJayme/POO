package exercises.list06;

import java.util.List;

public interface GenericDAO<K, T> {
    boolean insert(T type);
    T findOne (K key);
    List<T> findAll();
    boolean update(T type);
    boolean remove(K key);
}
