package odoo.xml;

public class InserirXmlDTO {
    private Integer number;
    private String department;
    private String fileName;
    private Byte xml;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Byte getXml() {
        return xml;
    }

    public void setXml(Byte xml) {
        this.xml = xml;
    }
}
