package resources;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;
import core.Saying;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/app-service")
@Produces(MediaType.APPLICATION_JSON)
public abstract class AppResource {

    @GET
    @Timed
    public Saying sayHello(@QueryParam("name") Optional<String> name) {
        return sayHello(name);
    }

    public abstract Saying sayHelloImpl(Optional<String> name);
}
