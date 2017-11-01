package com.asiainfo.webapp.startup.service.bjrbj;

import java.util.List;

import com.asiainfo.webapp.startup.dao.bjrbj.model.BjrbjRecord;
import com.asiainfo.webapp.startup.paging.Page;
import com.asiainfo.webapp.startup.vo.bjrbj.BjrbjVO;

public interface BjrbjService {
	BjrbjVO findOrder(int orderId);
	
	public List<BjrbjVO> findOrder(BjrbjRecord order, Page page);
	
	public int selectByModelCount(BjrbjRecord record);
	
	int newOrder(BjrbjRecord order);
}
