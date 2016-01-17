package ssh.dao;

import java.util.List;

public interface IBaseDAO<T> {
	/**
	 * 查找
	 * @param propertyName
	 * @param value
	 * @return
	 */
	public List<T> findByProperty(String propertyName, Object value);
	
	/**
	 * 保存
	 * @param instance
	 * @return
	 */
	public boolean add(T instance);
	
	/**
	 * hql查询
	 * @param hql
	 * @param values
	 * @return
	 */
	public List<T> findByHql(String hql, Object[] values);
	
	/**
	 * edit a instance and update it in database
	 * @param instance
	 * @return
	 */
	public boolean update(T instance);
	
	/**
	 * delete an existing instance
	 * @param instance
	 * @return
	 */
	public boolean delete(T instance);
	
	
}
