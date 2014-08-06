package resources;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;
import core.Saying;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/app-service")
@Produces(MediaType.APPLICATION_JSON)
public abstract class AppResource {

    @GET
    @Timed
    public Saying sayHello(@QueryParam("name") Optional<String> name) {

        return sayHelloImpl(name);
    }

    public abstract Saying sayHelloImpl(Optional<String> name);


}
