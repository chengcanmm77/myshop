package com.bucket.shop.service.goods;

import java.util.List;
import java.util.Map;

import com.bucket.shop.model.request.goods.AttributeQueryRequest;
import com.bucket.shop.model.ro.attribute.AttributeValueRo;

public interface AttributeValueService {

	public AttributeValueRo insert(AttributeValueRo attributeValueRo);

	/**
	 * 批量更新属性值
	 */
	public Boolean update(AttributeValueRo attributeValueRo);

	/**
	 * 批量更新属性值
	 * 
	 * @param attributeValueSOs
	 * @return
	 * @date: 2016年7月14日 下午2:21:47
	 */
	public Boolean batchUpdate(List<AttributeValueRo> attributeValueRoList);

	/**
	 * 查询属性值
	 * 
	 * @param map
	 * @return
	 * @date: 2016年7月14日 下午2:23:41
	 */
	public List<AttributeValueRo> query(Map<String, Object> map);

	/**
	 * 删除属性值
	 * 
	 * @param attrValueIds
	 * @return
	 * @date: 2016年7月14日 下午2:22:34
	 */
	public Boolean delAttributeValue(Long attrValueId);

	/**
	 * 批量删除属性值
	 * 
	 * @param attrValueIds
	 * @return
	 * @date: 2016年7月14日 下午2:22:34
	 */
	public Boolean batchDelAttributeValue(List<Long> attrValueIds);

	/**
	 * 根据条件查询属性值
	 * 
	 * @param attrNameId
	 * @param attrValueId
	 * @param status
	 * @return
	 * @date: 2016年3月5日 下午4:54:57
	 */
	public List<AttributeValueRo> queryByOption(Integer attrNameId, Integer attrValueId, Integer status);

	public List<AttributeValueRo> queryAttributeByValue(AttributeQueryRequest queryRequest);

	/**
	 * 根据属性ID,属性值名称精确查询属性信息
	 * 
	 * @param attrNameId
	 * @param attrValue
	 * @return
	 * @date: 2016年4月5日 下午8:50:07
	 */
	public AttributeValueRo queryAttrEqualValue(Integer attrNameId, String attrValue);

	/**
	 * 根据属性ID以及属性值名称删除属性值
	 * 
	 * @param attrNameId
	 * @param brandName
	 * @date: 2016年4月6日 下午12:02:42
	 */
	public void delAttributeValueByValue(Integer attrNameId, String brandName);

	/**
	 * 根据属性值id查找属性值
	 * 
	 * @param attrValueId
	 * @return
	 * @date: 2016年4月15日 下午4:17:17
	 */
	public AttributeValueRo queryAttributeValueById(String attrValueId);

	/**
	 * @param attributeValueSO
	 * @return
	 * @date: 2016年5月4日 下午7:41:44
	 */
	public Integer updateBrandAttrStatus(AttributeValueRo attributeValueSO);
}
