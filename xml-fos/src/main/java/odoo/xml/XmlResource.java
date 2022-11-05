package odoo.xml;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/xml")
public class XmlResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Xml> list() {
        return Xml.listAll();
    }

    @POST
    @Transactional
    public void novoXml() {
        Xml xml = new Xml();
        xml.name = "Fos";
        xml.description = "Folha de ordenado e salario";
        xml.persist();
    }

    // @DELETE
    // public Set<Xml> delete(Xml xml) {
    //     xmls.removeIf(existingFruit -> existingFruit.name.contentEquals(xml.name));
    //     return xmls;
    // }
}
