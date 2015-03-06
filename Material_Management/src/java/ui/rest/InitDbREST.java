/*
 * Copyright (C) 2014 lucs
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
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

/**
 *
 * @author lucs
 */
@Stateless
@Path("init-db")
public class InitDbREST {

    @PersistenceContext(unitName = "RESORTPU")
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
