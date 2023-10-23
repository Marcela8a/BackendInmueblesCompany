package com.inmueblescompany.apis;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
@Path("/hello")
public class HelloResource {
 
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String ping() {
    	String respuesta = "Ping, ejecutado exitosamente: " + new Date().toString();
        return respuesta;
    }	
}