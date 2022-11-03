package odoo.xml;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/xml")
public class XmlResource {

    private Set<Xml> xmls = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public XmlResource(){
        xmls.add(new Xml("fos.xml", "Folha de ordenado e salario"));
    }

    @GET
    public Set<Xml> list() {
        return xmls;
    }

    @POST
    public Set<Xml> add(Xml Xml) {
        xmls.add(Xml);
        return xmls;
    }

    @DELETE
    public Set<Xml> delete(Xml Xml) {
        xmls.removeIf(existingXml -> existingXml.name.contentEquals(Xml.name));
        return xmls;
    }
}
