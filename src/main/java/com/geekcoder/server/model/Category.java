/**
 * 
 */
package com.geekcoder.server.model;

/**
 * @author Cheng Liufeng
 * �������
 */
public class Category {
	private int cid;                   //�������id
	private int pid;                   //�����pid(pidΪ0������ڵ�)
	private String name;               //�������
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
