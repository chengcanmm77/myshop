package com.bucket.shop.web.controller.goods;

import com.bucket.shop.model.ro.attribute.AttributeRo;
import com.bucket.shop.service.goods.AttributeNameService;
import com.bucket.shop.service.goods.AttributeValueService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller("/goods/attr/")
public class AttributeController {
	
	@Resource
	private AttributeNameService attributeNameService;

	@Resource
	private AttributeValueService attributeValueService;

	@RequestMapping("/create")
	public AttributeRo create(AttributeRo ro){
		
		return null;
	}
}
