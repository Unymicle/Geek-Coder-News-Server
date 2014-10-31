package com.geekcoder.server.dao;

import com.geekcoder.server.model.Category;

/**
 * �������DAO��ӿ�
 * @author Cheng Liufeng
 *
 */
public interface CategoryDAO {
	//����һ���������
	public void insert(Category category) throws Exception;
	//����һ���������
	public void update(Category category) throws Exception;
	//ɾ��һ���������
	public void delete(int categoryId) throws Exception;
	//��ѯһ���������
	public Category queryById(int categoryId) throws Exception;
}
