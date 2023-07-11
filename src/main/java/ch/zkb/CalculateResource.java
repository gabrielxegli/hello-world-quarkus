package ch.zkb;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("add")
public class CalculateResource {
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("{n1}/{n2}")
    public String calculate(@PathParam("n1") String n1, @PathParam("n2") String n2){    
        return Integer.toString(Integer.parseInt(n1) + Integer.parseInt(n2));
    }
}
