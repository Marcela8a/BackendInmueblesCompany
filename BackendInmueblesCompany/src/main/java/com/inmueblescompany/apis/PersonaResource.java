package com.inmueblescompany.apis;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

/**
 * REST Web Service
 *
 * @author Marce
 */
@Path("personas")
public class PersonaResource {

    @Context
    private UriInfo context;

    /**
     * Crea un nueva intancia PersonasResource
     */
    public PersonaResource() {
    }

    /**
     * Devuelve una representacion de la instacion PersonaResource (test)
     * @return String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //Test
        String rta = "{\"test\":\"ok\"}";
        return rta;
    }

    /**
     * PUT metodo para actualziar o crear una instancia de PersonaResource
     * @param contenido para el recurso
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    	System.out.println("Aqui puedo actualizar una persona "+ content);
    }
    
}
