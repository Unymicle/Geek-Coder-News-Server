package com.geekcoder.server.dao;

import com.geekcoder.server.dao.impl.CategoryDAOImpl;
import com.geekcoder.server.dao.impl.NewsDAOImpl;


/**
 * DAO �����࣬���ڻ�ȡ����DAO��ʵ��
 * @author Cheng Liufeng
 *
 */
public class DAOFactory {
	/**
	 * ��ȡ����DAO��ʵ��
	 * @return
	 */
	public static NewsDAO getNewsDAOInstance() {
		return new NewsDAOImpl();
	}
	/**
	 * ��ȡ�������DAO��ʵ��
	 * @return
	 */
	public static CategoryDAO getCategoryDAOInstance() {
		return new CategoryDAOImpl();
	}
}
