package com.geekcoder.server.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * ���ݿ�������
 * @author Cheng Liufeng
 *
 */
public class DBConnection {
	//�������ݿ�������
	private static String driver = "com.mysql.jdbc.Driver";
	//�������ݿ�����url
	private static String url = "jdbc:mysql//localhost:3306/geek_coder_news";
	//�������ݿ��û���
	private static String username = "root";
	//�������ݿ�����
	private static String password = "jones-cnodejs992";
	//�������ݿ����Ӷ���
	private static Connection conn;
	
	/**
	 * ��ȡ���ݿ����Ӷ���
	 * @return
	 */
	public static Connection getConnection() {
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
		} catch(Exception e) {
			System.out.println("��������ʧ��"); 
		}
		return conn;
	}
	
	/**
	 * �ر����ݿ�����
	 */
	public static void Close() {
		try{
			conn.close();
		} catch(Exception e) {
			System.out.println("���ݿ����ӹر�ʧ��"); 
		}
	}
}
