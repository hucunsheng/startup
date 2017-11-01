package com.asiainfo.webapp.startup.dao.bjrbj.impl;

import com.asiainfo.webapp.startup.dao.bjrbj.BjrbjRecordMapper;
import com.asiainfo.webapp.startup.dao.bjrbj.model.BjrbjRecord;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BjrbjRecordMapperImpl implements BjrbjRecordMapper {
	//方法名需与Mapper.xml中的sql id匹配
    @Autowired
    private SqlSession sqlSession;
    public int insert(BjrbjRecord record){
        Integer i = sqlSession.insert("insert",record);
        return i;
    }

    public int insertSelective(BjrbjRecord record){

        return sqlSession.insert("insertSelective",record);
    }

    public BjrbjRecord selectByPrimaryKey(Integer orderId){

        return sqlSession.selectOne("selectByPrimaryKey",orderId);
    }
    
    //分页查询的方法要加上RowBounds参数
    public List<BjrbjRecord> selectByModel(BjrbjRecord record, RowBounds rb){
        return sqlSession.selectList("selectByModel",record,rb);
    }
    public  int selectByModelCount(BjrbjRecord record){
        return sqlSession.insert("selectByModelCount",record);

    }


    public int updateByPrimaryKeySelective(BjrbjRecord record){
        return sqlSession.update("updateByPrimaryKeySelective",record);
    }

    public int updateByPrimaryKey(BjrbjRecord record){
        return sqlSession.update("updateByPrimaryKey",record);

    }
}