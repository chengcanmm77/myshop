package com.bucket.shop.dal.dao.base;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import com.bucket.shop.dal.mapper.BaseMapper;
import com.bucket.shop.model.dbo.BaseDo;

public class BaseDao<T extends BaseDo> {

	private Class<T> entityClass;
	
	private BaseMapper<T> mapper;

	public BaseDao() {
		entityClass = getGenericClass();
	}

	@SuppressWarnings("unchecked")
	private Class<T> getGenericClass() {
		return  getSuperClassGenricType(getClass());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static Class<Object> getSuperClassGenricType(final Class clazz) {
		// 返回表示此Class所表示的实体(类、接口、基本类型或void)的直接父类的类型
		Type genType = clazz.getGenericSuperclass();

		if (!(genType instanceof ParameterizedType)) {
			return Object.class;
		}

		// 返回表示此类型实际类型参数的类型对象的数组
		Type[] params = ((ParameterizedType) genType).getActualTypeArguments();

		if (params.length == 0) {
			return Object.class;
		}
		if (!(params[0] instanceof Class)) {
			return Object.class;
		}

		return (Class<Object>) params[0];
	}
	
	
}
