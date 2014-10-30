package com.geekcoder.server.dao;

import com.geekcoder.server.model.News;

/**
 * ������DAO��ӿ�
 * @author Cheng Liufeng
 *
 */
public interface NewsDAO {
	//����һ������
	public void insert(News news);
	//����һ������
	public void update(News news);
	//ɾ��һ������
	public void delete(int newsId);
	//��ѯһ������
	public News queryById(int newsId);
}
