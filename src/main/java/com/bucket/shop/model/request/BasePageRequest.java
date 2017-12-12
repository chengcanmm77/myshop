package com.bucket.shop.model.request;

import java.io.Serializable;

/**
 * 分页查询基础请求参数
 * @author yuguantou
 * @version 1.0
 * @date 2017年12月12日
 */
public class BasePageRequest implements Serializable{
	private static final long serialVersionUID = -8077461804562446182L;

	private Long page;
	
	private Long pageSize;

	public Long getPage() {
		return page;
	}

	public void setPage(Long page) {
		this.page = page;
	}

	public Long getPageSize() {
		return pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	
	
}
