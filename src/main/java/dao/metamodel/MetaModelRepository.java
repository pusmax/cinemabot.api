package dao.metamodel;

import java.util.List;

public interface MetaModelRepository<T> {
    List<T> getAll();
    T get(int id);
    void save(T entity);
    void delete(T entity);
}
