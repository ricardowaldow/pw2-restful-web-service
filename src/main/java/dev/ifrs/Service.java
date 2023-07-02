package dev.ifrs;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("")
public class Service {

    @GET
    @Path("/calc/km/{nos}")
    @Produces(MediaType.APPLICATION_JSON)
    public Result nosParaKm(@PathParam("nos") final Double nos) {
        Result result = new Result();
        result.result = nos * 1.852;
        return result;
    }

    @POST
    @Path("/calc/ml/{km}")
    @Produces(MediaType.TEXT_PLAIN)
    public Double kmParaMMilhas(@PathParam("km") final Double km) {
        return  km * 0.621371;
    }

}
