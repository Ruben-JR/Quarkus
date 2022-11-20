package odoo.xml;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Xml extends PanacheEntity{
    public String xml;

    public Xml() {

    }

    public Xml(String xml) {
        this.xml = xml;
    }
}
