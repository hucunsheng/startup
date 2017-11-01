package com.asiainfo.webapp.startup.service.order;

import java.util.List;

import com.asiainfo.webapp.startup.dao.order.model.OrderRecord;
import com.asiainfo.webapp.startup.paging.Page;
import com.asiainfo.webapp.startup.vo.order.OrderVO;

public interface OrderService {
	OrderVO findOrder(int orderId);
	
	public List<OrderVO> findOrder(OrderRecord order, Page page);
	
	int newOrder(OrderRecord order);
}
