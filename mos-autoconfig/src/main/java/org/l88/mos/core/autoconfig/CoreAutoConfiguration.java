package org.l88.mos.core.autoconfig;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConditionalOnProperty("mos.home")
@PropertySource(value="file:${mos.home}/mos.properties",ignoreResourceNotFound=true)
@ComponentScan("org.l88.mos.core")
@EnableConfigurationProperties({MosSettings.class})
public class CoreAutoConfiguration {

}
