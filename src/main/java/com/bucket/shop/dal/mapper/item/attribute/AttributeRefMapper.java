package com.bucket.shop.dal.mapper.item.attribute;

import java.util.List;
import java.util.Map;

import com.bucket.shop.model.dbo.goods.attribute.AttributeRefDo;


public interface AttributeRefMapper {
	/**
     * 持久化属性关联关系
     * @param attrRefList 
     * @date: 2016年3月5日 上午9:50:56
     */
    public void insertAttrRef(List<AttributeRefDo> attrRefList);
    /**
     * 根据属性ID删除属性关联关系
     * @param attrNameId 属性ID
     * @date: 2016年3月5日 上午9:52:00
     * @return TODO
     */
    public Integer deleteByAttrNameId(Integer attrNameId);
    /**
     * 根据属性名ID或属性值ID列表删除关联关系
     * @param paramsMap
     * @return
     * @date: 2016年8月12日 下午3:26:52
     */
    public Integer deleteByAttr(Map<String, Object> paramsMap);
    /**
     * 根据关联属性删除
     * @param paramsMap
     * @return
     * @date: 2016年8月15日 下午2:15:27
     */
    public Integer deleteByRefAttr(Map<String, Object> paramsMap);
    /**
     * 查询属性关联信息
     * @param queryOption
     * @return
     * @date: 2016年3月5日 上午10:05:55
     */
    public List<AttributeRefDo> queryAttrRefList(Map<String, Object> paramsMap);
    
    /**
     * 通过attrNameId查询关联属性信息
     * @param attrNameId
     * @return
     * @date: 2016年7月21日 下午10:05:06
     */
    public List<AttributeRefDo> queryAttrRefInfoList(Integer attrNameId);
}
