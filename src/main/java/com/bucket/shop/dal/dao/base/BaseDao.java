package com.bucket.shop.dal.dao.base;

import java.util.List;

import com.bucket.shop.dal.mapper.BaseMapper;
import com.bucket.shop.model.dbo.BaseDo;

public abstract class BaseDao<T extends BaseDo> {

	protected abstract BaseMapper getMapper();

	int insert(T object){
		return this.getMapper().insert(object);
	}

	void insertList(List<BaseDo> objList){
		 this.getMapper().insertList(objList);
	}

	int update(T object){
		return this.getMapper().insert(object);
	}

	boolean deleteById(Long id){
	   int cnt = this.getMapper().deleteById(id);
	   if(cnt >0){
		   return true;
	   }
	   return false;
	}

	boolean logicDeleteById(Long id) {
		int cnt = this.getMapper().logicDeleteById(id);
		if (cnt > 0) {
			return true;
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	public T queryById(Long id){
		return (T) this.getMapper().queryById(id);
	}

	@SuppressWarnings("unchecked")
	List<T> selectList(BaseDo object){
		return (List<T>) this.getMapper().selectList(object);
	}
}
