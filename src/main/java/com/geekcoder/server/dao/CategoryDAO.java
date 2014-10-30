package com.geekcoder.server.dao;

import com.geekcoder.server.model.Category;

/**
 * �������DAO��ӿ�
 * @author Cheng Liufeng
 *
 */
public interface CategoryDAO {
	//����һ���������
	public void insert(Category category);
	//����һ���������
	public void update(Category category);
	//ɾ��һ���������
	public void delete(int categoryId);
	//��ѯһ���������
	public Category queryById(int categoryId);
}
