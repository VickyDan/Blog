package cn.JBlog.bean;

import java.sql.Date;

public class Article {
	int id;
	String title;// ����
	String tag;// ����
	Date createDate;// ����ʱ��
	Date updateDate;// ����ʱ��
	String reads;// �Ķ���
	String content;//����
	String source;// ���ݴ洢λ��
	String status;// �ַ����Ͳݸ�����
	String url;//��ȡ���������url��ַ
	int size;//���´�С
	Image []image;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getReads() {
		return reads;
	}
	public void setReads(String reads) {
		this.reads = reads;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Image[] getImage() {
		return image;
	}
	public void setImage(Image[] image) {
		this.image = image;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
