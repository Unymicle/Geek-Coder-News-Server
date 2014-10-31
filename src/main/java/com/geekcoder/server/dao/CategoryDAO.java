package com.geekcoder.server.dao;

import com.geekcoder.server.model.Category;

/**
 * 新闻类别DAO层接口
 * @author Cheng Liufeng
 *
 */
public interface CategoryDAO {
	//增加一条新闻类别
	public void insert(Category category) throws Exception;
	//更新一条新闻类别
	public void update(Category category) throws Exception;
	//删除一条新闻类别
	public void delete(int categoryId) throws Exception;
	//查询一条新闻类别
	public Category queryById(int categoryId) throws Exception;
}
