package octo.waddle.hellodropwizard;

import io.dropwizard.Configuration;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

@Data
public class HelloDropwizardConfiguration extends Configuration {
    @NotEmpty
    private String message;

}
