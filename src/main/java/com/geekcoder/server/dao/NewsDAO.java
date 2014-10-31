package com.geekcoder.server.dao;

import com.geekcoder.server.model.News;

/**
 * 新闻类DAO层接口
 * @author Cheng Liufeng
 *
 */
public interface NewsDAO {
	//增加一条新闻
	public void insert(News news) throws Exception;
	//更新一条新闻
	public void update(News news) throws Exception;
	//删除一条新闻
	public void delete(int newsId) throws Exception;
	//查询一条新闻
	public News queryById(int newsId);
}
