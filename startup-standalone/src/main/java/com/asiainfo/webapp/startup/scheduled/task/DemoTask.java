package com.asiainfo.webapp.startup.scheduled.task;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.asiainfo.webapp.startup.dao.order.model.OrderRecord;
import com.asiainfo.webapp.startup.service.order.OrderService;

public class DemoTask {
	private static final Logger logger = LoggerFactory.getLogger(DemoTask.class);
	
	@Resource(name="orderService") 
	private OrderService orderService;
	
	public void executeTask() {
		logger.info("DemoTask 开始");
		
		OrderRecord order = new OrderRecord();
		order.setWareId(200);
		order.setUserId(101);
		order.setOrderDesc("定时测试");
		orderService.newOrder(order);
		
		logger.info("DemoTask 结束");
	}
}
