package odoo.xml;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Xml extends PanacheEntity{
    public Integer number;
    public String department;
    public String fileName;
    public Byte xml;

    public Xml() {

    }

    public Xml(Integer number, String department, String fileName, Byte xml) {
        this.number = number;
        this.department = department;
        this.fileName = fileName;
        this.xml = xml;
    }
}
