package dao;

import dao.metamodel.MetaModelRepository;
import dao.metamodel.repositories.AttributeRepository;
import dao.metamodel.repositories.ObjectRepository;
import dao.metamodel.repositories.ObjectTypeRepository;
import dao.metamodel.repositories.ParamRepository;
import dao.models.User;

import java.util.List;

public class UserRepository implements MetaModelRepository<User> {
    private AttributeRepository attributeRepository;
    private ObjectRepository objectRepository;
    private ObjectTypeRepository objectTypeRepository;
    private ParamRepository paramRepository;

    public UserRepository(AttributeRepository attributeRepository, ObjectRepository objectRepository, ObjectTypeRepository objectTypeRepository, ParamRepository paramRepository) {
        this.attributeRepository = attributeRepository;
        this.objectRepository = objectRepository;
        this.objectTypeRepository = objectTypeRepository;
        this.paramRepository = paramRepository;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public void save(User entity) {

    }

    @Override
    public void delete(User entity) {

    }
}
