package ssh.hibernate.pojo;

/**
 * Pictures entity. @author MyEclipse Persistence Tools
 */
public class Pictures extends AbstractPictures implements java.io.Serializable {

	// Constructors

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** default constructor */
	public Pictures() {
	}

	/** minimal constructor */
	public Pictures(Integer albumid) {
		super(albumid);
	}

	/** full constructor */
	public Pictures(Integer albumid, String content) {
		super(albumid, content);
	}

}
