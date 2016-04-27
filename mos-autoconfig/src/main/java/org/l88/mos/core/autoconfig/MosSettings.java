package org.l88.mos.core.autoconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix=MosSettings.MOS_PREFIX)
public class MosSettings {
	public static final String MOS_PREFIX = "mos";
	
	/**
	 * Mos Home Path.Such as "file:.","classpath:META-INF"
	 */
	private String home;

	
	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}
	
}
