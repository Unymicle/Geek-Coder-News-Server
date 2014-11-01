package com.geekcoder.server.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 数据库连接类
 * @author Cheng Liufeng
 *
 */
public class DBConnection {
	//定义数据库驱动类
	private static String driver = "com.mysql.jdbc.Driver";
	//定义数据库连接url
	private static String url = "jdbc:mysql://localhost:3306/geek_coder_news";
	//定义数据库用户名
	private static String username = "root";
	//定义数据库密码
	private static String password = "jones-cnodejs992";
	//定义数据库连接对象
	private static Connection conn;
	
	/**
	 * 获取数据库连接对象
	 * @return
	 */
	public static Connection getConnection() {
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
		} catch(Exception e) {
			System.out.println("加载驱动失败"); 
		}
		return conn;
	}
	
	/**
	 * 关闭数据库连接
	 */
	public static void Close() {
		try{
			conn.close();
		} catch(Exception e) {
			System.out.println("数据库连接关闭失败"); 
		}
	}
}
