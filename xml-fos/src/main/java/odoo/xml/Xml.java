package odoo.xml;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Xml extends PanacheEntity{
    public String name;
    public String xml;

    public Xml() {

    }

    public Xml(String name, String xml) {
        this.name = name;
        this.xml = xml;
    }
}
