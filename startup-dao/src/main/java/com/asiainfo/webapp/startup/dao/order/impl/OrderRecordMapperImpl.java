package com.asiainfo.webapp.startup.dao.order.impl;

import com.asiainfo.webapp.startup.dao.order.OrderRecordMapper;
import com.asiainfo.webapp.startup.dao.order.model.OrderRecord;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderRecordMapperImpl  implements OrderRecordMapper{
	//方法名需与Mapper.xml中的sql id匹配
    @Autowired
    private SqlSession sqlSession;
    public int insert(OrderRecord record){
        Integer i = sqlSession.insert("insert",record);
        return i;
    }

    public int insertSelective(OrderRecord record){
        Integer i = sqlSession.insert("insertSelective",record);
        return i;
    }

    public OrderRecord selectByPrimaryKey(Integer orderId){
        return sqlSession.selectOne("selectByPrimaryKey",orderId);
    }
    
    //分页查询的方法要加上RowBounds参数
    public List<OrderRecord> selectByModel(OrderRecord record, RowBounds rb){
        return sqlSession.selectList("selectByModel",record,rb);
    }

    public int updateByPrimaryKeySelective(OrderRecord record){
        return  sqlSession.update("updateByPrimaryKeySelective",record);
    }

    public int updateByPrimaryKey(OrderRecord record){
        return  sqlSession.update("updateByPrimaryKey",record);

    }
}