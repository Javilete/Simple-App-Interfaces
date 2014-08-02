package resources;

import core.models.Email;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/myApp/email")
public abstract class EmailResource {

    @GET
    @Path("/{userId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Email> getEmails(@PathParam("userId") String userId){
        return getEmails(userId);
    }

    public abstract List<Email> getEmailsImpl(String userId);

}
