package com.geekcoder.server.dao;

import com.geekcoder.server.daoImpl.CategoryDAOImpl;
import com.geekcoder.server.daoImpl.NewsDAOImpl;

/**
 * DAO 工厂类，用于获取具体DAO的实例
 * @author Cheng Liufeng
 *
 */
public class DAOFactory {
	/**
	 * 获取新闻DAO的实例
	 * @return
	 */
	public static NewsDAO getNewsDAOInstance() {
		return new NewsDAOImpl();
	}
	/**
	 * 获取新闻类别DAO的实例
	 * @return
	 */
	public static CategoryDAO getCategoryDAOInstance() {
		return new CategoryDAOImpl();
	}
}
