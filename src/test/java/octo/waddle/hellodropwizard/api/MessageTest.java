package octo.waddle.hellodropwizard.api;

import static io.dropwizard.testing.FixtureHelpers.*;
import static org.assertj.core.api.Assertions.assertThat;
import io.dropwizard.jackson.Jackson;
import org.junit.Test;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MessageTest {

    private static final ObjectMapper MAPPER = Jackson.newObjectMapper();

    @Test
    public void serializesToJSON() throws Exception {
        final Message msg = new Message("Hello, Tester!");

        final String expected = MAPPER.writeValueAsString(
                MAPPER.readValue(fixture("fixtures/message.json"), Message.class));

        assertThat(MAPPER.writeValueAsString(msg)).isEqualTo(expected);
    }

}
