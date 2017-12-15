package com.bucket.shop.dal.mapper;

import java.util.List;

import com.bucket.shop.common.so.BaseSo;
import com.bucket.shop.model.dbo.BaseDo;

public interface BaseMapper {

	int insert(BaseDo object);
	
	void insertList(List<BaseDo> objList);
	
	int update(BaseDo object);
	
	int deleteById(Long id);
	
	int logicDeleteById(Long id);
	 
	T queryById(Long id);
	
	List<T> selectList(BaseSo so);
	
}
