package org.l88.mos.um;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ConditionalOnWebApplication
public class WebConfiguration extends WebMvcConfigurerAdapter implements ApplicationContextAware {
	private ApplicationContext appCtx;

	@Override
	public void setApplicationContext(ApplicationContext appcontext) throws BeansException {
		this.appCtx = appcontext;
	}

	@Autowired
	private ServerProperties server;

	@Bean
	@ConditionalOnMissingBean
	public UserSettings mosUserSettings() {
		return new UserSettings();
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		super.addResourceHandlers(registry);
		registry.addResourceHandler(mosUserSettings().getContextPath() + "/**")
				.addResourceLocations("classpath:/META-INF/org.l88.mos.user/");
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		UserSettings us = mosUserSettings();
		if (StringUtils.hasText(us.getContextPath())) {
			registry.addRedirectViewController(us.getContextPath(),
					server.getPath(us.getContextPath()) + "/");
		}
		registry.addViewController(us.getContextPath() + "/")
				.setViewName("forward:index.html");
	}

}
