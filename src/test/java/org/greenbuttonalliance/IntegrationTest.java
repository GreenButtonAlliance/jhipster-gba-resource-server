package org.greenbuttonalliance;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.greenbuttonalliance.config.AsyncSyncConfiguration;
import org.greenbuttonalliance.config.EmbeddedSQL;
import org.greenbuttonalliance.config.JacksonConfiguration;
import org.greenbuttonalliance.config.TestSecurityConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(
    classes = {
        JhipstergbaresourceserverApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class,
    }
)
@EmbeddedSQL
public @interface IntegrationTest {
}
