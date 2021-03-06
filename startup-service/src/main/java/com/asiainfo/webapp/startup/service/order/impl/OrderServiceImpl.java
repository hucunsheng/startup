package com.asiainfo.webapp.startup.service.order.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;

import com.asiainfo.webapp.startup.dao.order.OrderRecordMapper;
import com.asiainfo.webapp.startup.dao.order.model.OrderRecord;
import com.asiainfo.webapp.startup.paging.Page;
import com.asiainfo.webapp.startup.service.order.OrderService;
import com.asiainfo.webapp.startup.vo.order.OrderVO;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
	//自动装配mapper bean
	@Autowired
	private OrderRecordMapper orderRecordMapper;
	
	public OrderVO findOrder(int orderId) {
		orderRecordMapper.selectByPrimaryKey(orderId);
		return null;
	}

	public List<OrderVO> findOrder(OrderRecord order, Page page) {
		List<OrderRecord> list = orderRecordMapper.selectByModel(order,
				new RowBounds(page.getSkip(), page.getMax()));
		List<OrderVO> ret = new  ArrayList<OrderVO>(5);
		for(OrderRecord or : list) {
			ret.add(model2VO(or));
		}
		return ret;
	}

	public int newOrder(OrderRecord order) {
		return orderRecordMapper.insertSelective(order);
	}
	
	private OrderVO model2VO(OrderRecord model) {
		OrderVO vo = new OrderVO();
		vo.setOrderId(model.getOrderId());
		vo.setUserId(model.getUserId());
		vo.setWareId(model.getWareId());
		vo.setOrderDesc(model.getOrderDesc());
		return vo;
	}
}
