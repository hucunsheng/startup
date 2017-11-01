package com.asiainfo.webapp.startup.dao.order.model;

import java.sql.Date;

import org.apache.ibatis.type.Alias;

//设置别名注解后，可以在Mapper.xml中直接使用，如parameterType="OrderRecord"
@Alias("OrderRecord")  
public class OrderRecord {
    private Integer orderId;

    private Integer wareId;

    private Integer userId;

    private String orderDesc;
    
    private Date createTime;
    
    private Date updateTime;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getWareId() {
        return wareId;
    }

    public void setWareId(Integer wareId) {
        this.wareId = wareId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
    
}