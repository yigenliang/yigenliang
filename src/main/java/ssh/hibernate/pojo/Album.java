package ssh.hibernate.pojo;

/**
 * Album entity. @author MyEclipse Persistence Tools
 */
public class Album extends AbstractAlbum implements java.io.Serializable {

	// Constructors

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** default constructor */
	public Album() {
	}

	/** full constructor */
	public Album(String discription) {
		super(discription);
	}

}
