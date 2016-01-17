package ssh.service;

import java.util.List;
import ssh.hibernate.pojo.Technology;

public interface TechArticleService{
	public boolean addArticle(Technology article);
	public boolean updateArticle(Technology article);
	public List<Technology> findArticleByProperty(String prop, Object value);
	public List<Technology> findArtcleByProperties(String hql, Object[] values);
}
