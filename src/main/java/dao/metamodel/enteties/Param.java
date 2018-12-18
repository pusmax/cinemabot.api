package dao.metamodel.enteties;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "params")
public class Param {
    @Id @GeneratedValue
    private int id;
    @Column(name = "text_value")
    private String textValue;
    @Column(name = "number_value")
    private int numbValue;
    @Column(name = "date_value")
    private Date dateValue;
    private Attribute attribute;
    private Object object;
}
