package octo.waddle.hellodropwizard.resources;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.dropwizard.jackson.Jackson;
import octo.waddle.hellodropwizard.api.Message;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloWorldResourceTest {

    private static final ObjectMapper MAPPER = Jackson.newObjectMapper();
    private final HelloWorldResource resource = new HelloWorldResource("Hello, %s!");

    @Test
    public void testGetHello() throws JsonProcessingException {
        final Message output = resource.sayHello("Tester");
        assertThat(output.getContent()).isEqualTo("Hello, Tester!");
    }
}
