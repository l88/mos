package org.l88.mos.core.autoconfig;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

public class PreparedListener implements ApplicationListener<ApplicationPreparedEvent> {

	@Override
	public void onApplicationEvent(ApplicationPreparedEvent arg0) {
		System.out.println("=== MOS Framework Prepared ===");
	}

}
