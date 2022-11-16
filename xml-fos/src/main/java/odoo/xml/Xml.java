package odoo.xml;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Xml extends PanacheEntity{
    public Integer number;
    public String name;
    public String xml;

    public Xml() {

    }

    public Xml(Integer number, String name, String xml) {
        this.number = number;
        this.name = name;
        this.xml = xml;
    }
}
