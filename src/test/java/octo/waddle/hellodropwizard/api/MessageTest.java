package octo.waddle.hellodropwizard.api;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MessageTest {


    @Test
    public void testGetter() throws Exception {
        final Message msg = new Message("Hello, Tester!");

        assertThat(msg.getContent()).isEqualTo("Hello, Tester!");
    }

}
