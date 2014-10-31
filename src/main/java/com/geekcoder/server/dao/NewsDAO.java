package com.geekcoder.server.dao;

import com.geekcoder.server.model.News;

/**
 * ������DAO��ӿ�
 * @author Cheng Liufeng
 *
 */
public interface NewsDAO {
	//����һ������
	public void insert(News news) throws Exception;
	//����һ������
	public void update(News news) throws Exception;
	//ɾ��һ������
	public void delete(int newsId) throws Exception;
	//��ѯһ������
	public News queryById(int newsId);
}
