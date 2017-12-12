package com.bucket.shop.dal.dao.item.attribute;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.bucket.shop.dal.mapper.item.attribute.AttributeRefMapper;
import com.bucket.shop.model.dbo.goods.attribute.AttributeRefDo;
import com.bucket.shop.model.request.goods.AttributeQueryRequest;
import com.google.common.collect.Maps;

@Repository
public class AttributeRefDao {

	@Resource
    private AttributeRefMapper attributeRefMapper;

    /**
     * 持久化属性关联关系
     * @param attrRefList 
     * @date: 2016年3月5日 上午9:50:56
     */
    public void insertAttrRef(List<AttributeRefDo> attrRefList) {
        attributeRefMapper.insertAttrRef(attrRefList);
    }

    /**
     * 根据属性ID删除属性关联关系
     * @param attrNameId 属性ID
     * @date: 2016年3月5日 上午9:52:00
     * @return 
     */
    public Integer deleteByAttrNameId(Integer attrNameId) {
        return attributeRefMapper.deleteByAttrNameId(attrNameId);
    }

    /**
     * 根据属性名ID或属性值ID列表删除关联关系
     * @param paramsMap
     * @return
     * @date: 2016年8月12日 下午3:26:52
     */
    public Integer deleteByAttr(Map<String, Object> paramsMap) {
        return attributeRefMapper.deleteByAttr(paramsMap);
    }

    /**
     * 根据关联属性删除
     * @param paramsMap
     * @return
     * @date: 2016年8月15日 下午2:15:27
     */
    public Integer deleteByRefAttr(Map<String, Object> paramsMap) {
        return attributeRefMapper.deleteByRefAttr(paramsMap);
    }

    /**
     * 查询属性关联信息
     * @param queryOption
     * @return
     * @date: 2016年3月5日 上午10:05:55
     */
    public List<AttributeRefDo> queryAttrRefList(AttributeQueryRequest queryOption) {
        Map<String, Object> paramsMap = Maps.newHashMap();
        paramsMap.put("categoryId", queryOption.getCategoryId());
        paramsMap.put("attrNameId", queryOption.getAttrNameId());
        paramsMap.put("attrValueId", queryOption.getAttrValueId());
        paramsMap.put("attrNameRefId", queryOption.getAttrNameRefId());
        paramsMap.put("attrValueRefId", queryOption.getAttrValueRefId());

        return attributeRefMapper.queryAttrRefList(paramsMap);
    }

    public List<AttributeRefDo> queryAttrRefInfoList(Integer attrNameId) {
        return attributeRefMapper.queryAttrRefInfoList(attrNameId);
    }

}
