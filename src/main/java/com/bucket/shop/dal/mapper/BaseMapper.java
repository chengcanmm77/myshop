package com.bucket.shop.dal.mapper;

import java.util.List;

import com.bucket.shop.common.so.BaseSo;
import com.bucket.shop.common.vo.BaseVo;
import com.bucket.shop.model.BaseDo;

public interface BaseMapper<T extends BaseDo,V extends BaseVo> {

	int insert(T object);
	
	int update(T object);
	
	int deleteById(Long id);
	
	int logicDeleteById(Long id);
	 
	T queryById(Long id);
	
	V queryVoById(Long id);
	
	List<T> selectList(BaseSo so);
	
	List<V> selectVoList(BaseSo so);
}
