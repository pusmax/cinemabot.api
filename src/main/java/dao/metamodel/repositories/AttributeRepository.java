package dao.metamodel.repositories;

import dao.metamodel.enteties.Attribute;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributeRepository extends CrudRepository<Attribute, Long> {
}
