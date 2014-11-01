package com.geekcoder.server.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.geekcoder.server.dao.CategoryDAO;
import com.geekcoder.server.model.Category;
import com.geekcoder.server.util.DBConnection;

/**
 * 新闻类别DAO层实现
 * @author Cheng Liufeng
 *
 */
public class CategoryDAOImpl implements CategoryDAO {

	/**
	 * 添加一条新闻类别
	 * @throws Exception 
	 */
	public void insert(Category category) throws Exception {
		String sql = "INSERT INTO category(pid, name) VALUES(?, ?)";
		PreparedStatement psmt = null;
		Connection conn = null;
		try{
			conn = DBConnection.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, category.getPid());
			psmt.setString(2, category.getName());
			psmt.executeUpdate();
			psmt.close();
		} catch(Exception e) {
			System.out.println("操作出现异常！");
		} finally{
			conn.close();
		}
	}
	/**
	 * 更新一条新闻类别
	 * @throws Exception 
	 */
	public void update(Category category) throws Exception {
		String sql = "UPDATE category SET pid=?,name=? where cid=?";
		PreparedStatement psmt = null;
		Connection conn = null;
		try {
			conn = DBConnection.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, category.getPid());
			psmt.setString(2, category.getName());
			psmt.setInt(3, category.getCid());
		} catch(Exception e) {
			System.out.println("操作出现异常！");
		} finally{
			conn.close();
		}
	}

	/**
	 * 删除一条新闻类别
	 * @throws Exception 
	 */
	public void delete(int categoryId) throws Exception {
		String sql = "DELETE FROM　category WHERE cid=?";
		PreparedStatement psmt = null;
		Connection conn = null;
		try {
			conn = DBConnection.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, categoryId);
		} catch(Exception e) {
			System.out.println("操作出现异常！");
		} finally{
			conn.close();
		}
	}
	
	/**
	 * 获取一条记录
	 * @throws Exception 
	 */
	public Category queryById(int categoryId) throws Exception {
		String sql = "SELECT * FROM category WHERE cid=?";
		PreparedStatement psmt = null;
		Connection conn = null;
		Category category = new Category();
		try {
			conn = DBConnection.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, categoryId);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()) {
				category.setCid(rs.getInt(1));
				category.setPid(rs.getInt(2));
				category.setName(rs.getString(3));
			}
		} catch(Exception e) {
			System.out.println("操作出现异常！");
		} finally {
			conn.close();
		}
		return category;
	}

}
