package com.inmueblescompany.apis;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.google.gson.Gson;
import com.inmueblescompany.casosdeuso.BusquedaInmueblesBusiness;
import com.inmueblescompany.casosdeuso.respuestas.ResultadoInmueblesPorPersonaVO;

/**
 * REST Web Service
 *
 * @author Marce
 */
@Path("registroinmuebles")
public class RegistroInmuebleResource {

    @Context
    private UriInfo context;

    /**
     * Crea una instancia de RegistroInmueblesResource
     */
    public RegistroInmuebleResource() {
    }
    

    /**
     * Devuelve la representacion de una lista de instancias de RegistroInmueblesResource
     * asociadas a una Persona
     * @param textoBusqueda para buscar
     * @return Respuesta con la lista de instancias
     */
    @GET
    @Path("buscar")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRegistrosPorPersona(@QueryParam("textoBusqueda") String textoBusqueda ) {
        try {
            List<ResultadoInmueblesPorPersonaVO> registros = new BusquedaInmueblesBusiness().buscarInmueblesHabitadosPorPersona(textoBusqueda);
            String json = new Gson().toJson(registros);
            return Response.ok(json, MediaType.APPLICATION_JSON).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Error: " + e.toString()).build();
        }
    }

    /**
     * PUT metodo para actualziar o crear una instancia de RegistroInmueblesResource
     * @param contenido para el recurso
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    	System.out.println("Contenido recibido y listo para actualizar "+ content);
    }
}
