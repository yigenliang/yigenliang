package ssh.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

public class BaseDAOImpl<T> extends HibernateDaoSupport implements IBaseDAO<T> {
	private String className;
	private Class<T> entityClass;
	
	/**
	 *
	 */
	@SuppressWarnings("unchecked")
	public BaseDAOImpl() {
		try {
			entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		} catch (Exception e) {
			entityClass = (Class<T>) Object.class;
			//e.printStackTrace();
		}
		className = entityClass.getSimpleName();
	}
	
	/**
	 * save instance
	 * @param instance
	 * @return
	 */
	public boolean add(T instance){
		this.getHibernateTemplate().save(instance);
		return true;
	}
	
	/**
	 * update instance
	 * @param instance
	 * @return
	 */
	public boolean update(T instance){
		this.getHibernateTemplate().update(instance);
		return true;
	}
	
	/**
	 * delete instance
	 * @param instance
	 * @return
	 */
	public boolean delete(T instance){
		this.getHibernateTemplate().delete(instance);
		return true;
	}
	/**
	 *  find instances by using one property
	 * @param propertyName
	 * @param value
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<T> findByProperty(String propertyName, Object value) {
		List<T> list = new ArrayList<T>();
		try {
			String queryString = "from " + className + " as model where model."
					+ propertyName + "= ?";
			list = this.getHibernateTemplate().find(queryString, value);
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * find instances by using more than one properties
	 */
	@SuppressWarnings("unchecked")
	public List<T> findByHql(String hql, Object[] values){
		List<T> list = new ArrayList<T>();
		try{
			list = this.getHibernateTemplate().find(hql, values);
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
}
