package dao.metamodel;

import dao.metamodel.repositories.AttributeRepository;
import dao.metamodel.repositories.ObjectRepository;
import dao.metamodel.repositories.ObjectTypeRepository;
import dao.metamodel.repositories.ParamRepository;

import java.util.List;

public class MetaModelRepositoryImpl<T> implements MetaModelRepository<T> {
    private AttributeRepository attributeRepository;
    private ObjectRepository objectRepository;
    private ObjectTypeRepository objectTypeRepository;
    private ParamRepository paramRepository;

    public MetaModelRepositoryImpl(AttributeRepository attributeRepository, ObjectRepository objectRepository, ObjectTypeRepository objectTypeRepository, ParamRepository paramRepository) {
        this.attributeRepository = attributeRepository;
        this.objectRepository = objectRepository;
        this.objectTypeRepository = objectTypeRepository;
        this.paramRepository = paramRepository;
    }
    @Override
    public List<T> getAll() {
        return null;
    }

    @Override
    public T get(int id) {
        return null;
    }

    @Override
    public void save(T entity) {

    }

    @Override
    public void delete(T entity) {

    }
}
