package ssh.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import ssh.hibernate.pojo.Technology;

public class BaseTechnologyArticleDAOImpl extends HibernateDaoSupport implements ITechnologyArticleDAO {
	public boolean addArticle(Technology article) throws HibernateException{
		this.getHibernateTemplate().save(article);
		return true;
	}
	public boolean updateArticle(Technology article) throws HibernateException{
		this.getHibernateTemplate().update(article);
		return true;
	}
	public boolean deleteArticle(Technology article) throws HibernateException{
		this.getHibernateTemplate().delete(article);
		return true;
	}
	public Technology getArticleById(int id) throws HibernateException{
		Technology article = this.getHibernateTemplate().get(Technology.class, id);
		return article;
	}
	@SuppressWarnings("unchecked")
	public List<Technology> getArticlePage(String queryString,int pageSize,int page){
		Session session = this.getHibernateTemplate().getSessionFactory().openSession();
		Query query = session.createQuery(queryString); 
		query.setFirstResult((page-1)*pageSize); 
		query.setMaxResults(pageSize); 
		List<Technology> list= query.list();
		session.close();
		return list;
		}
}
