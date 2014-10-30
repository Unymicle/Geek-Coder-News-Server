package com.geekcoder.server.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.geekcoder.server.dao.NewsDAO;
import com.geekcoder.server.model.News;
import com.geekcoder.server.util.DBConnection;

/**
 * 新闻类DAO层实现
 * @author Cheng Liufeng
 *
 */
public class NewsDAOImpl implements NewsDAO {

	/**
	 * 添加一条新闻
	 */
	public void insert(News news) {
		String sql = "INSERT INTO news(cid, title, keywords, description, status, summary, published, update_time, content, aid) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement psmt = null ;
		Connection conn = null;
		try{
			conn = DBConnection.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, news.getCid());
			psmt.setString(2, news.getTitle());
			psmt.setString(3, news.getKeywords());
			psmt.setString(4, news.getDescription());
			psmt.setInt(5, news.getStatus());
			psmt.setString(6, news.getSummary());
			psmt.setInt(7, news.getPublished());
			psmt.setInt(8, news.getUpdateTime());
			psmt.setString(9, news.getContent());
			psmt.setInt(10, news.getAid());
			psmt.executeUpdate();
			psmt.close();
		} catch(Exception e) {
			System.out.println("操作出现异常！");
		}
	}
	
	/**
	 * 修改一条新闻
	 */
	public void update(News news) {
		String sql = "UPDATE news SET cid=?, title=?, keywords=?, description=?, status=?, summary=?, published=?, update_time=?, content=?, aid=? WHERE id=?";
		PreparedStatement psmt = null ;
		Connection conn = null;
		try{
			conn = DBConnection.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, news.getCid());
			psmt.setString(2, news.getTitle());
			psmt.setString(3, news.getKeywords());
			psmt.setString(4, news.getDescription());
			psmt.setInt(5, news.getStatus());
			psmt.setString(6, news.getSummary());
			psmt.setInt(7, news.getPublished());
			psmt.setInt(8, news.getUpdateTime());
			psmt.setString(9, news.getContent());
			psmt.setInt(10, news.getAid());
			psmt.setInt(11, news.getId());
			psmt.executeUpdate();
			psmt.close();
		} catch(Exception e) {
			System.out.println("操作出现异常！");
		}		
	}
	
	/**
	 * 删除一条新闻
	 */
	public void delete(int newsId) {
		String sql = "DELETE FROM news WHERE id=?";
		PreparedStatement psmt = null;
		Connection conn = null;
		try{
			conn = DBConnection.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, newsId);
			psmt.executeUpdate();
			psmt.close();
		} catch(Exception e) {
			System.out.println("操作出现异常！");
		}
	}
	
	/**
	 * 查询一条新闻
	 */
	public News queryById(int newsId) {
		News news = null;
		return news;
	}

}
