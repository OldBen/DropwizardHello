package octo.waddle.hellodropwizard.resources;

import static org.assertj.core.api.Assertions.assertThat;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.dropwizard.jackson.Jackson;
import javax.ws.rs.core.Application;
import octo.waddle.hellodropwizard.HelloDropwizardApplication;
import octo.waddle.hellodropwizard.api.Message;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HelloWorldResourceTest {

    private static final ObjectMapper MAPPER = Jackson.newObjectMapper();
    private final HelloWorldResource resource = new HelloWorldResource("Hello, %s!");

    @Test
    public void testGetHello() throws JsonProcessingException {
        final Message output = resource.sayHello("Tester");
        assertThat(output.getContent()).isEqualTo("Hello, Tester!");
    }
}
