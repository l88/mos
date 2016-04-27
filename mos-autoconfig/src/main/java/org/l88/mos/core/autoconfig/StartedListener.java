package org.l88.mos.core.autoconfig;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

public class StartedListener implements ApplicationListener<ApplicationStartedEvent> {

	@Override
	public void onApplicationEvent(ApplicationStartedEvent env) {
		System.out.println("=== MOS Framework Started ===");
	}

}
