package ssh.service;

import java.util.List;
import ssh.dao.IBaseDAO;
import ssh.hibernate.pojo.Technology;

public class TechArticleServiceImpl implements TechArticleService {
	private IBaseDAO<Technology> baseDao;
	public void setBaseDao(IBaseDAO<Technology> baseDao){
		this.baseDao = baseDao;
	}
	public IBaseDAO<Technology> getBaseDao(){
		return this.baseDao;
	}
	@Override
	public boolean addArticle(Technology article) {
		// TODO Auto-generated method stub
		boolean res = baseDao.add(article);
		return res;
	}

	@Override
	public boolean updateArticle(Technology article) {
		// TODO Auto-generated method stub
		boolean res = baseDao.update(article);
		return res;
	}

	@Override
	public List<Technology> findArticleByProperty(String propertyName, Object value) {
		// TODO Auto-generated method stub
		List<Technology> res = baseDao.findByProperty(propertyName, value);
		return res;
	}

	@Override
	public List<Technology> findArtcleByProperties(String hql, Object[] values) {
		// TODO Auto-generated method stub
		List<Technology> res = baseDao.findByHql(hql, values);
		return res;
	}

}
