package resources;

import core.models.Settings;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/myApp/settings")

public abstract class SettingsResource {

    @GET
    @Path("/{userId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Settings getSettings(@PathParam("userId") String userId){
        return getSettingsImpl(userId);
    }

    public abstract Settings getSettingsImpl(String userId);
}
