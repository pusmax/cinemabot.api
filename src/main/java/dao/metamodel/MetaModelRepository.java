package dao.metamodel;

import java.util.List;

public interface MetaModelRepository<T> {
    List<T> GetAll();
    T GetById(int id);
    void Save(T entity);
    void Delete(T entity);
}
