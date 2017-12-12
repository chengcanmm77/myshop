package com.bucket.shop.common.vo.item.category;

import java.util.List;

import com.bucket.shop.common.vo.BaseVo;

public class CategoryVo extends BaseVo {
	private static final long serialVersionUID = 3280977111645916797L;
	/**
	 * 类目ID,主键
	 */
	private Long Id;
	/**
	 * 类目名称
	 */
	private String categoryName;
	/**
	 * 类目编码
	 */
	private String categoryCode;
	/**
	 * 类目描述
	 */
	private String categoryDesc;
	/**
	 * 父节点类目编码
	 */
	private String parentCategoryCode;
	/**
	 * 类目状态
	 */
	private Integer status;

	/**
	 * 
	 * 类目可否售卖标志, 1-可售卖; 2-不可售卖;
	 */
	private Integer saleStatus;

	/**
	 * 类目父ID
	 */
	private Integer parentId;
	/**
	 * 类目树形结构（把当前类目的所有上级类目用逗号分隔的方式添加进来）
	 */
	private String treePath;
	/**
	 * 类目层级（当前类目是第几级类目，0是一级类目，后面依次递加）
	 */
	private Integer grade;
	/**
	 * 类目排序
	 */
	private Integer categoryOrder;
	/**
	 * 是否是页子节点
	 */
	private Integer isLeaf;

	private List<CategoryVo> list;

	private List<Integer> categoryIds;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCategoryDesc() {
		return categoryDesc;
	}

	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

	public String getParentCategoryCode() {
		return parentCategoryCode;
	}

	public void setParentCategoryCode(String parentCategoryCode) {
		this.parentCategoryCode = parentCategoryCode;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getSaleStatus() {
		return saleStatus;
	}

	public void setSaleStatus(Integer saleStatus) {
		this.saleStatus = saleStatus;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getTreePath() {
		return treePath;
	}

	public void setTreePath(String treePath) {
		this.treePath = treePath;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public Integer getCategoryOrder() {
		return categoryOrder;
	}

	public void setCategoryOrder(Integer categoryOrder) {
		this.categoryOrder = categoryOrder;
	}

	public Integer getIsLeaf() {
		return isLeaf;
	}

	public void setIsLeaf(Integer isLeaf) {
		this.isLeaf = isLeaf;
	}

	public List<CategoryVo> getList() {
		return list;
	}

	public void setList(List<CategoryVo> list) {
		this.list = list;
	}

	public List<Integer> getCategoryIds() {
		return categoryIds;
	}

	public void setCategoryIds(List<Integer> categoryIds) {
		this.categoryIds = categoryIds;
	}

}
