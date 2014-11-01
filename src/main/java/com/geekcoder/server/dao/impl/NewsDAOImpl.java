package com.geekcoder.server.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
	 * @throws Exception 
	 */
	public void insert(News news) throws Exception {
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
		} finally{
			conn.close();
		}
	}
	
	/**
	 * 修改一条新闻
	 * @throws Exception 
	 */
	public void update(News news) throws Exception {
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
		} finally{
			conn.close();
		}
	}
	
	/**
	 * 删除一条新闻
	 * @throws Exception 
	 */
	public void delete(int newsId) throws Exception {
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
		} finally{
			conn.close();
		}
	}
	
	/**
	 * 查询一条新闻
	 * @throws Exception 
	 */
	public News queryById(int newsId) throws Exception {
		String sql = "SELECT * FROM news WHERE id=?";
		PreparedStatement psmt = null;
		Connection conn = null;
		News news = new News();
		try {
			conn = DBConnection.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, newsId);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()) {
				news.setId(rs.getInt(1));
				news.setCid(rs.getInt(2));
				news.setTitle(rs.getString(3));
				news.setKeywords(rs.getString(4));
				news.setDescription(rs.getString(5));
				news.setStatus(rs.getInt(6));
				news.setSummary(rs.getString(7));
				news.setPublished(rs.getInt(8));
				news.setUpdateTime(rs.getInt(9));
				news.setContent(rs.getString(10));
				news.setAid(rs.getInt(11));
			}
		} catch(Exception e) {
			System.out.println("操作出现异常！");
		} finally {
			conn.close();
		}
		return news;
	}

}
