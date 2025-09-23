/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portfolio;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hola")
public class EjemploJakartaRest {
    @GET
    @Path("/{nombre}")
    @Produces(MediaType.APPLICATION_JSON)
    public String saludo(@PathParam("nombre") String nombre) {
        return "{ \"mensaje\": \"Hola, " + nombre + "\" }";
    }
}
