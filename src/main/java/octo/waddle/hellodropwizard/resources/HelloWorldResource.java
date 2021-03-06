package octo.waddle.hellodropwizard.resources;

import com.codahale.metrics.annotation.Timed;
import octo.waddle.hellodropwizard.api.Message;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello/{name}")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {

    private final String template;

    public HelloWorldResource(String template) {
        this.template = template;
    }

    @GET
    @Timed
    public Message sayHello(@PathParam("name") String name) {
        final String value = String.format(template, name);
        return new Message(value);
    }
}
