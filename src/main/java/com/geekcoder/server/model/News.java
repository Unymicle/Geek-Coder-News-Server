package com.geekcoder.server.model;

/**
 * @author Cheng Liufeng
 * 新闻
 */
public class News {
	private int id;                     //主键id，自增
	private int cid;                    //新闻类别id，外键
	private String title;               //标题
	private String keywords;            //关键字
	private String description;         //描述
	private int status;                 //发布状态（0未发布，1已发布，2已删除）
	private String summary;             //摘要
	private int published;              //发布时间
	private int updateTime;            //最后一次更新时间
	private String content;             //新闻内容
	private int aid;                    //操作管理员
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public int getPublished() {
		return published;
	}
	public void setPublished(int published) {
		this.published = published;
	}
	public int getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(int updateTime) {
		this.updateTime = updateTime;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
}
