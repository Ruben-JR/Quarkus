package odoo.xml;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/xml")
public class XmlResource {
    @Inject
    XmlService xmlService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Xml> list() {
        return xmlService.list();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void novoXml(InserirXmlDTO inserirXmlDTO) {
        xmlService.novoXml(inserirXmlDTO);
    }
}
