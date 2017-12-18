package com.bucket.shop.web.controller.goods;

import com.bucket.shop.model.dbo.goods.attribute.AttributeNameDo;
import com.bucket.shop.model.ro.attribute.AttributeNameRo;
import com.bucket.shop.model.ro.attribute.AttributeRo;
import com.bucket.shop.service.goods.AttributeNameService;
import com.bucket.shop.service.goods.AttributeValueService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller("/goods/attr/")
public class AttributeController {
	
	@Resource
	private AttributeNameService attributeNameService;

	@Resource
	private AttributeValueService attributeValueService;

	@RequestMapping("/name/create")
	@ResponseBody
	public AttributeNameDo create(AttributeNameRo ro){
		return attributeNameService.insert(ro);
	}

	@RequestMapping("/name/update")
	public void update(AttributeNameRo ro){
		attributeNameService.update(ro);
	}

	@RequestMapping("/name/deleteById")
	public void deleteById(Long id){
		attributeNameService.queryAttributeNameById(id);
	}

	@RequestMapping("/name/queryById")
	@ResponseBody
	public AttributeNameRo queryById(Long id){
		return attributeNameService.queryAttributeNameById(id);
	}

	@RequestMapping("/create")
	public AttributeRo createAttr(AttributeRo ro){

		return null;
	}

	@RequestMapping("/update")
	public AttributeRo updateAttr(AttributeRo ro){
		return null;
	}

	@RequestMapping("/deleteById")
	public Boolean deleteAttrById(Long id){
		return null;
	}

	@RequestMapping("/queryById")
	@ResponseBody
	public AttributeRo queryAttrById(Long id){
		return null;
	}

}
