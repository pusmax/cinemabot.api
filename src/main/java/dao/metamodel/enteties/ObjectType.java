package dao.metamodel.enteties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "object_type")
public class ObjectType {
    @Id @GeneratedValue
    private long id;
    private String name;
}
