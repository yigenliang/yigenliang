package ssh.hibernate.pojo;

/**
 * Appendix entity. @author MyEclipse Persistence Tools
 */
public class Appendix extends AbstractAppendix implements java.io.Serializable {

	// Constructors

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** default constructor */
	public Appendix() {
	}

	/** full constructor */
	public Appendix(Integer articleid, String brief) {
		super(articleid, brief);
	}

}
