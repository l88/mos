package org.l88.mos.core.impl;

import org.l88.mos.service.CommonService;
import org.springframework.stereotype.Service;

@Service
public class DefaultCommonService implements CommonService {

	@Override
	public String echo(String msg) {
		return msg;
	}

	@Override
	public String hello(String name) {
		if (name == null)
			return "hello world";
		return "hello," + name + " , I'm MOS!";
	}

}
