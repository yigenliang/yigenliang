package ssh.hibernate.pojo;

/**
 * AbstractUserinfo entity provides the base persistence definition of the
 * Userinfo entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUserinfo implements java.io.Serializable {

    // Fields

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Integer userid;
    private String password;
    private String name;

    // Constructors

    /**
     * default constructor
     */
    public AbstractUserinfo() {
    }

    /**
     * full constructor
     */
    public AbstractUserinfo(String password, String name) {
        this.password = password;
        this.name = name;
    }

    // Property accessors

    public Integer getUserid() {
        return this.userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}