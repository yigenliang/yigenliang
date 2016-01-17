package ssh.dao;

import java.util.List;
import ssh.hibernate.pojo.Technology;

public interface ITechnologyArticleDAO {
	public boolean addArticle(Technology article);
	public boolean updateArticle(Technology article);
	public boolean deleteArticle(Technology article);
	public Technology getArticleById(int id);
	public List<Technology> getArticlePage(String queryString, int pageSize, int page);
}
