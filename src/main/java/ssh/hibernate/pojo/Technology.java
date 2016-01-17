package ssh.hibernate.pojo;

/**
 * Technology entity. @author MyEclipse Persistence Tools
 */
public class Technology extends AbstractTechnology implements
		java.io.Serializable {

	// Constructors

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** default constructor */
	public Technology() {
	}

	/** full constructor */
	public Technology(Integer permission, Integer categoryid, String title,
			String content) {
		super(permission, categoryid, title, content);
	}

}
