package com.bucket.shop.dal.mapper;

import java.util.List;

import com.bucket.shop.model.dbo.BaseDo;

public interface BaseMapper {

	int insert(BaseDo object);
	
	void insertList(List<BaseDo> objList);
	
	int update(BaseDo object);
	
	int deleteById(Long id);
	
	int logicDeleteById(Long id);
	 
	BaseDo queryById(Long id);
	
	List<BaseDo> selectList(BaseDo object);
	
}
