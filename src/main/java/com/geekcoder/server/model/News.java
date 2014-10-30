package com.geekcoder.server.model;

/**
 * @author Cheng Liufeng
 * ����
 */
public class News {
	private int id;                     //����id������
	private int cid;                    //�������id�����
	private String title;               //����
	private String keywords;            //�ؼ���
	private String description;         //����
	private int status;                 //����״̬��0δ������1�ѷ�����2��ɾ����
	private String summary;             //ժҪ
	private int published;              //����ʱ��
	private int updateTime;            //���һ�θ���ʱ��
	private String content;             //��������
	private int aid;                    //��������Ա
	
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
