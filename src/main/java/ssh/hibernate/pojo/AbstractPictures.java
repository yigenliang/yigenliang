package ssh.hibernate.pojo;

/**
 * AbstractPictures entity provides the base persistence definition of the
 * Pictures entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPictures implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer pictureid;
	private Integer albumid;
	private String content;

	// Constructors

	/** default constructor */
	public AbstractPictures() {
	}

	/** minimal constructor */
	public AbstractPictures(Integer albumid) {
		this.albumid = albumid;
	}

	/** full constructor */
	public AbstractPictures(Integer albumid, String content) {
		this.albumid = albumid;
		this.content = content;
	}

	// Property accessors

	public Integer getPictureid() {
		return this.pictureid;
	}

	public void setPictureid(Integer pictureid) {
		this.pictureid = pictureid;
	}

	public Integer getAlbumid() {
		return this.albumid;
	}

	public void setAlbumid(Integer albumid) {
		this.albumid = albumid;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}