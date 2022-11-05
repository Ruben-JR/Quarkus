package odoo.xml;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Xml extends PanacheEntity{
    public String name;
    public String description;

    public Xml() {

    }

    public Xml(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
