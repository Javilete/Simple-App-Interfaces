package resources;

import core.models.Email;

import javax.validation.Valid;
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
        return getEmailsImpl(userId);
    }

    public abstract List<Email> getEmailsImpl(String userId);

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void sendEmail(@Valid Email email){
        sendEmailImpl(email);
    }

    public abstract void sendEmailImpl(Email email);
}
