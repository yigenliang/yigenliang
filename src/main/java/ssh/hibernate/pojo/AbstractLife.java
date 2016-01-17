package ssh.hibernate.pojo;

import java.util.Date;

/**
 * AbstractLife entity provides the base persistence definition of the Life
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLife implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer lifeid;
	private Integer categoryid;
	private Integer permission;
	private String pictureaddr;
	private String title;
	private Date edittime;
	private String content;

	// Constructors

	/** default constructor */
	public AbstractLife() {
	}

	/** full constructor */
	public AbstractLife(Integer categoryid, Integer permission,
			String pictureaddr, String title, Date edittime, String content) {
		this.categoryid = categoryid;
		this.permission = permission;
		this.pictureaddr = pictureaddr;
		this.title = title;
		this.edittime = edittime;
		this.content = content;
	}

	// Property accessors

	public Integer getLifeid() {
		return this.lifeid;
	}

	public void setLifeid(Integer lifeid) {
		this.lifeid = lifeid;
	}

	public Integer getCategoryid() {
		return this.categoryid;
	}

	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}

	public Integer getPermission() {
		return this.permission;
	}

	public void setPermission(Integer permission) {
		this.permission = permission;
	}

	public String getPictureaddr() {
		return this.pictureaddr;
	}

	public void setPictureaddr(String pictureaddr) {
		this.pictureaddr = pictureaddr;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getEdittime() {
		return this.edittime;
	}

	public void setEdittime(Date edittime) {
		this.edittime = edittime;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}