package com.bucket.shop.dal.mapper.item.attribute;

import java.util.List;
import java.util.Map;

import com.bucket.shop.model.dbo.goods.attribute.AttributeValueDo;

public interface AttributeValueMapper {

    public long insert(AttributeValueDo attributeValueDo);

    public long update(AttributeValueDo attributeValueDo);

    public int delete(Long id);

    public AttributeValueDo queryDoById(Long id);

    public  List<AttributeValueDo> query(Map<String,Object> map);
   
    public Integer batchDelAttributeValue(List<Integer> attrValueIds);
   
    public List<AttributeValueDo> queryByOption(Map<String, Object> paramsMap);
    
    public List<AttributeValueDo> queryAttributeByValue(AttributeValueDo attributeValueDO);
    
	public AttributeValueDo queryAttrEqualValue(Map<String, Object> paramsMap);
	
    public Integer updateBrandAttrStatus(AttributeValueDo attributeValueDO);

}
