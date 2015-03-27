package ui.rest;

import java.util.LinkedList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Stateless
@Path("init-db")
public class InitDbREST {

    //@PersistenceContext(unitName = "resortdb")
    private EntityManager em;

    /*@GET
    @Produces({"application/json", "application/xml"})
    public SampleParkEntity createDB() {
        List<Object> objectsToSave = new LinkedList<>();

        SampleParkEntity parkEntity = new SampleParkEntity();
        parkEntity.setName("ABC");
        objectsToSave.add(parkEntity);
        
        parkEntity = new SampleParkEntity();
        parkEntity.setName("EDF");
        objectsToSave.add(parkEntity);

        SampleBungalowEntity sampleBungalowEntity = new SampleBungalowEntity();
        sampleBungalowEntity.setName("abc");
        objectsToSave.add(sampleBungalowEntity);

        for (Object objectsToSave1 : objectsToSave) {
            em.persist(objectsToSave1);
        }

        return parkEntity;
    }*/

}
