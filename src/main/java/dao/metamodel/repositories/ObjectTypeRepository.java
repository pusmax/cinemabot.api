package dao.metamodel.repositories;

import dao.metamodel.enteties.ObjectType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjectTypeRepository extends CrudRepository<ObjectType, Long> {
}
