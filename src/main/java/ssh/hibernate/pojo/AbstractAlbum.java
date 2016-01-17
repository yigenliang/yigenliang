package ssh.hibernate.pojo;

/**
 * AbstractAlbum entity provides the base persistence definition of the Album
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAlbum implements java.io.Serializable {

    // Fields

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Integer albumid;
    private String discription;

    // Constructors

    /**
     * default constructor
     */
    public AbstractAlbum() {
    }

    /**
     * full constructor
     */
    public AbstractAlbum(String discription) {
        this.discription = discription;
    }

    // Property accessors

    public Integer getAlbumid() {
        return this.albumid;
    }

    public void setAlbumid(Integer albumid) {
        this.albumid = albumid;
    }

    public String getDiscription() {
        return this.discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

}