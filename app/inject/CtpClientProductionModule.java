package inject;

import com.google.inject.AbstractModule;
import io.sphere.sdk.client.PlayJavaSphereClient;
import io.sphere.sdk.client.SphereClient;

import javax.inject.Singleton;

/**
 * Configuration for the Guice {@link com.google.inject.Injector} which
 * shall be used in production and integration tests.
 */
public class CtpClientProductionModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(SphereClient.class).toProvider(SphereClientProvider.class).in(Singleton.class);
        bind(PlayJavaSphereClient.class).toProvider(PlayJavaSphereClientProvider.class).in(Singleton.class);
    }
}
