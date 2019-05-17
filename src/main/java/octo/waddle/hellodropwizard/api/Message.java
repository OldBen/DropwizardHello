package octo.waddle.hellodropwizard.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import org.hibernate.validator.constraints.Length;

public class Message{

    @Getter
    private String content;

    public Message() {}

    public Message(String content) {
        this.content = content;
    }

}
