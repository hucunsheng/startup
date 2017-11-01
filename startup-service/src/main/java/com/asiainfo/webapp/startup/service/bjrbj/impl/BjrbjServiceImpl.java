package com.asiainfo.webapp.startup.service.bjrbj.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.asiainfo.webapp.startup.dao.bjrbj.BjrbjRecordMapper;
import com.asiainfo.webapp.startup.dao.bjrbj.model.BjrbjRecord;
import com.asiainfo.webapp.startup.paging.Page;
import com.asiainfo.webapp.startup.service.bjrbj.BjrbjService;
import com.asiainfo.webapp.startup.vo.bjrbj.BjrbjVO;
import org.springframework.stereotype.Service;


@Service
public class BjrbjServiceImpl implements BjrbjService {
	private static final Logger logger = LoggerFactory.getLogger(BjrbjServiceImpl.class);

	//自动装配mapper bean
	@Autowired
	private BjrbjRecordMapper bjrbjRecordMapper;
	
	public BjrbjVO findOrder(int orderId) {
		BjrbjRecord br = bjrbjRecordMapper.selectByPrimaryKey(orderId);
		return model2VO(br);
	}

	public List<BjrbjVO> findOrder(BjrbjRecord order, Page page) {
		List<BjrbjRecord> list = bjrbjRecordMapper.selectByModel(order,
				new RowBounds(page.getSkip(), page.getMax()));
		List<BjrbjVO> ret = new  ArrayList<BjrbjVO>(5);
		for(BjrbjRecord or : list) {
			logger.info(or.getCertificateAddress());
			ret.add(model2VO(or));
		}
		return ret;
	}
	public int selectByModelCount(BjrbjRecord record){
		int a = bjrbjRecordMapper.selectByModelCount(record);
		return a;
	}
	public int newOrder(BjrbjRecord order) {
		return bjrbjRecordMapper.insert(order);
	}
	
	private BjrbjVO model2VO(BjrbjRecord model) {
		BjrbjVO vo = new BjrbjVO();
		BeanUtils.copyProperties(model, vo);
		return vo;
	}
}
