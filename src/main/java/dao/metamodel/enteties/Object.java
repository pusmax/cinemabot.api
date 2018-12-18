package dao.metamodel.enteties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "objects")
public class Object {
    @Id @GeneratedValue
    private int id;
    private String name;
    private ObjectType objectType;
}
