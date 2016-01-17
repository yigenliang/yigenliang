package ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import ssh.hibernate.pojo.Technology;
import ssh.service.TechArticleService;

public class TechArticleAction extends ActionSupport {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Technology article;
    private TechArticleService techService;
    private int articleId;
    private String articleName;
    private int articleType;
    private String articleContent;

    public void setArticle(Technology article) {
        this.article = article;
    }

    public Technology getArticle() {
        return this.article;
    }

    public void setTechService(TechArticleService techService) {
        this.techService = techService;
    }

    public TechArticleService getTechService() {
        return this.techService;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public int getArticleType() {
        return articleType;
    }

    public void setArticleType(int articleType) {
        this.articleType = articleType;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    // default method
    public String execute() throws Exception {
        System.out.println("execute");
        return SUCCESS;
    }

    public String addArticle() throws Exception {
        System.out.println("add article");
        return SUCCESS;
    }

    public String updateArticle() throws Exception {
        System.out.println("edit article");
        return SUCCESS;
    }

    public String showArticle() throws Exception {
        System.out.println("Show an article");
        return SUCCESS;
    }

    public String articleList() throws Exception {
        System.out.println(" article list");
        return SUCCESS;
    }
}
