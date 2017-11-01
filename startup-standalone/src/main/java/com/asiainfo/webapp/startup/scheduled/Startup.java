package com.asiainfo.webapp.startup.scheduled;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asiainfo.webapp.startup.util.ContextHolder;

public class Startup {
	public static void main(String[] args) {
		ContextHolder.setCtx(new ClassPathXmlApplicationContext("root.xml"));
	}
}
