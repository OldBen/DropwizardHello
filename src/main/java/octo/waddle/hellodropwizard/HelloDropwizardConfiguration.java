package octo.waddle.hellodropwizard;

import io.dropwizard.Configuration;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

@Data
public class HelloDropwizardConfiguration extends Configuration {
    @NotEmpty
    @Getter
    @Setter
    private String message;

    @NotEmpty
    @Getter
    @Setter
    private String name = "Stranger";

}
