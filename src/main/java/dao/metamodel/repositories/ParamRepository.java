package dao.metamodel.repositories;

import dao.metamodel.enteties.Param;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParamRepository extends CrudRepository<Param, Long> {
}
