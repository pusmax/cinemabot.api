package dao.metamodel.enteties;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "objects")
public class Object {
    @Id @GeneratedValue
    private long id;
    private String name;
    private ObjectType objectType;

    public Object(String name) {
        this.name = name;
    }
}
