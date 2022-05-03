package com.gs2e.datacollectoriot;

import com.gs2e.datacollectoriot.DataCollectorIoTApp;
import com.gs2e.datacollectoriot.RedisTestContainerExtension;
import com.gs2e.datacollectoriot.config.EmbeddedMongo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = DataCollectorIoTApp.class)
@ExtendWith(RedisTestContainerExtension.class)
@EmbeddedMongo
public @interface IntegrationTest {
}
