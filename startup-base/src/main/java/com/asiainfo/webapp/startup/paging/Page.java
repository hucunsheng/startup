package com.asiainfo.webapp.startup.paging;

/**
 * 分页模型
 * @author hucs
 *
 */
public class Page {
	private Integer rows = 10;
	private Integer page = 1;
	public Integer getSkip() {
		return (page - 1) * rows;
	}
	public Integer getMax() {
		return rows;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	
}
