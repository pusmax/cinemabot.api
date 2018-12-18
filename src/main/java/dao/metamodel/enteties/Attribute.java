package dao.metamodel.enteties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "attributes")
public class Attribute {
    @Id @GeneratedValue
    private long id;
    private String name;
    private ObjectType objectType;
}
