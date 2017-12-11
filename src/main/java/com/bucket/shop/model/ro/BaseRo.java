package com.bucket.shop.model.ro;

import java.io.Serializable;
import java.util.Date;

public class BaseRo implements Serializable{

	 /**创建人*/
    protected String            createPerson;

    /**创建时间*/
    protected Date              createTime;

    /**更新人*/
    protected String            updatePerson;

    /**更新时间*/
    protected Date              updateTime;

	public String getCreatePerson() {
		return createPerson;
	}

	public void setCreatePerson(String createPerson) {
		this.createPerson = createPerson;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdatePerson() {
		return updatePerson;
	}

	public void setUpdatePerson(String updatePerson) {
		this.updatePerson = updatePerson;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

    
}
