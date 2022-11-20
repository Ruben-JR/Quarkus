package odoo.xml;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import io.quarkus.arc.Lock;
import io.quarkus.arc.Lock.Type;

@Lock
@ApplicationScoped
public final class XmlService {
    @Lock(value = Type.READ, time = 3, unit = TimeUnit.SECONDS)
    public List<Xml> list() {
        return Xml.listAll();
    }

    @Transactional
    public void novoXml(InserirXmlDTO inserirXmlDTO) {
        Xml xml = new Xml();
        xml.xml = inserirXmlDTO.getXml();
        xml.persist();
    }
}
