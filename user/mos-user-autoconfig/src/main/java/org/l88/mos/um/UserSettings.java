package org.l88.mos.um;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="mos.user")
public class UserSettings {
	/**
	 * User Web Context Path
	 */
	private String contextPath;

	public String getContextPath() {
		return contextPath;
	}

	public void setContextPath(String contextPath) {
		this.contextPath = contextPath;
	}
	
}
