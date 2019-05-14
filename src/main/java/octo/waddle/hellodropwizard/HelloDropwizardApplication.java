package octo.waddle.hellodropwizard;

import octo.waddle.hellodropwizard.resources.HelloWorldResource;
import octo.waddle.hellodropwizard.health.TemplateHealthCheck;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloDropwizardApplication extends Application<HelloDropwizardConfiguration> {

    public static void main(final String[] args) throws Exception {
        new HelloDropwizardApplication().run(args);
    }

    @Override
    public String getName() {
        return "HelloDropwizard";
    }

    @Override
    public void initialize(final Bootstrap<HelloDropwizardConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final HelloDropwizardConfiguration configuration,
                    final Environment environment) {
        final HelloWorldResource resource = new HelloWorldResource(
                configuration.getMessage(),
                configuration.getName()
        );
        final TemplateHealthCheck healthCheck =
                new TemplateHealthCheck(configuration.getMessage());
        environment.healthChecks().register("template", healthCheck);
        environment.jersey().register(resource);
    }

}
