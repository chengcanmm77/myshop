package com.bucket.shop.dal.dao.item;

import java.util.List;

import com.bucket.shop.common.so.BaseSo;
import com.bucket.shop.common.vo.BaseVo;
import com.bucket.shop.dal.mapper.BaseMapper;
import com.bucket.shop.model.BaseDo;

public abstract class BaseDao<T extends BaseDo,V extends BaseVo> {

	@SuppressWarnings("rawtypes")
	protected abstract BaseMapper getMapper();
	
	@SuppressWarnings("unchecked")
	public int insert(T object){
		return this.getMapper().insert(object);
	}
	
	@SuppressWarnings("unchecked")
	int update(T object){
		return this.getMapper().update(object);
	}
	
	int deleteById(Long id){
		return this.getMapper().deleteById(id);
	}
	
	int logicDeleteById(Long id){
		return this.getMapper().logicDeleteById(id);
	}
	 
	@SuppressWarnings("unchecked")
	T queryById(Long id){
		return (T) this.getMapper().queryById(id);
	}
	
	@SuppressWarnings("unchecked")
	V queryVoById(Long id){
		return (V) this.getMapper().queryVoById(id);
	}
	
	@SuppressWarnings("unchecked")
	List<T> selectList(BaseSo so){
		return this.getMapper().selectList(so);
	}
	
	@SuppressWarnings("unchecked")
	List<V> selectVoList(BaseSo so){
		return this.getMapper().selectVoList(so);
	}
	
	
}
