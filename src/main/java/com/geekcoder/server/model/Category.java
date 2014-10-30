package com.geekcoder.server.model;

/**
 * @author Cheng Liufeng
 * 新闻类别
 */
public class Category {
	private int cid;                   //新闻类别id
	private int pid;                   //父类别pid(pid为0代表跟节点)
	private String name;               //类别名称
	
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
