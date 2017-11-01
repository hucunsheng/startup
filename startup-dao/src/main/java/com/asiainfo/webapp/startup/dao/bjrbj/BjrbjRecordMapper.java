package com.asiainfo.webapp.startup.dao.bjrbj;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.asiainfo.webapp.startup.dao.bjrbj.model.BjrbjRecord;
import org.springframework.stereotype.Repository;

@Repository
public interface BjrbjRecordMapper {
	//方法名需与Mapper.xml中的sql id匹配
    int insert(BjrbjRecord record);

    int insertSelective(BjrbjRecord record);

    BjrbjRecord selectByPrimaryKey(Integer orderId);
    
    //分页查询的方法要加上RowBounds参数
    List<BjrbjRecord> selectByModel(BjrbjRecord record, RowBounds rb);
    int selectByModelCount(BjrbjRecord record);
  

    int updateByPrimaryKeySelective(BjrbjRecord record);

    int updateByPrimaryKey(BjrbjRecord record);
}