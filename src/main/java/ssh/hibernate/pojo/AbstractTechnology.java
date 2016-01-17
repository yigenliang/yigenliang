package ssh.hibernate.pojo;

/**
 * AbstractTechnology entity provides the base persistence definition of the
 * Technology entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTechnology implements java.io.Serializable {

    // Fields

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Integer articleid;
    private Integer permission;
    private Integer categoryid;
    private String title;
    private String content;

    // Constructors

    /**
     * default constructor
     */
    public AbstractTechnology() {
    }

    /**
     * full constructor
     */
    public AbstractTechnology(Integer permission, Integer categoryid,
                              String title, String content) {
        this.permission = permission;
        this.categoryid = categoryid;
        this.title = title;
        this.content = content;
    }

    // Property accessors

    public Integer getArticleid() {
        return this.articleid;
    }

    public void setArticleid(Integer articleid) {
        this.articleid = articleid;
    }

    public Integer getPermission() {
        return this.permission;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    public Integer getCategoryid() {
        return this.categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}