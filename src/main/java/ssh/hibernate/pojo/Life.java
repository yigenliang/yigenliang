package ssh.hibernate.pojo;

import java.util.Date;

/**
 * Life entity. @author MyEclipse Persistence Tools
 */
public class Life extends AbstractLife implements java.io.Serializable {

	// Constructors

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** default constructor */
	public Life() {
	}

	/** full constructor */
	public Life(Integer categoryid, Integer permission, String pictureaddr,
			String title, Date edittime, String content) {
		super(categoryid, permission, pictureaddr, title, edittime, content);
	}

}
