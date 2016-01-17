package ssh.hibernate.pojo;

/**
 * AbstractCategory entity provides the base persistence definition of the
 * Category entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCategory implements java.io.Serializable {

    // Fields

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Integer categoryid;
    private String name;

    // Constructors

    /**
     * default constructor
     */
    public AbstractCategory() {
    }

    /**
     * full constructor
     */
    public AbstractCategory(String name) {
        this.name = name;
    }

    // Property accessors

    public Integer getCategoryid() {
        return this.categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}