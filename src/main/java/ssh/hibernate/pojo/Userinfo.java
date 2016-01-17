package ssh.hibernate.pojo;

/**
 * Userinfo entity. @author MyEclipse Persistence Tools
 */
public class Userinfo extends AbstractUserinfo implements java.io.Serializable {

    // Constructors

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * default constructor
     */
    public Userinfo() {
    }

    /**
     * full constructor
     */
    public Userinfo(String password, String name) {
        super(password, name);
    }

}
