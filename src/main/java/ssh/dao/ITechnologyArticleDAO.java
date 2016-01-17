package ssh.dao;

import ssh.hibernate.pojo.Technology;

import java.util.List;

public interface ITechnologyArticleDAO {
    public boolean addArticle(Technology article);

    public boolean updateArticle(Technology article);

    public boolean deleteArticle(Technology article);

    public Technology getArticleById(int id);

    public List<Technology> getArticlePage(String queryString, int pageSize, int page);
}
