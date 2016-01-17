package ssh.hibernate.pojo;

/**
 * AbstractAppendix entity provides the base persistence definition of the
 * Appendix entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAppendix implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer appendid;
	private Integer articleid;
	private String brief;

	// Constructors

	/** default constructor */
	public AbstractAppendix() {
	}

	/** full constructor */
	public AbstractAppendix(Integer articleid, String brief) {
		this.articleid = articleid;
		this.brief = brief;
	}

	// Property accessors

	public Integer getAppendid() {
		return this.appendid;
	}

	public void setAppendid(Integer appendid) {
		this.appendid = appendid;
	}

	public Integer getArticleid() {
		return this.articleid;
	}

	public void setArticleid(Integer articleid) {
		this.articleid = articleid;
	}

	public String getBrief() {
		return this.brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

}