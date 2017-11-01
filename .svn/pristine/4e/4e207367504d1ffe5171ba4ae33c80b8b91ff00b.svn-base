package com.asiainfo.webapp.startup.util;

import org.springframework.context.ApplicationContext;

/**
 * 持有Spring ApplicationContext的引用，便于在程序中获取。<br>
 * 需要在ApplicationContext初始化完成后，调用setCtx方法注入。<br>
 * Web应用的场景，在初始化Listener中进行注入；standalone应用的场景，在main方法中进行注入
 * 
 * @author wukg
 *
 */
public class ContextHolder {
	private static ApplicationContext ctx;

	public static void setCtx(ApplicationContext ctx) {
		ContextHolder.ctx = ctx;
	}

	public static ApplicationContext getCtx() {
		return ctx;
	}
	
}
