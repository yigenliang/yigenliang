package ssh.service;

import java.util.List;

import org.hibernate.HibernateException;
import ssh.dao.IBaseDAO;
import ssh.hibernate.pojo.Userinfo;

public class UserServiceImpl implements UserService {
	
	private IBaseDAO<Userinfo> baseDao;
	
	public void setBaseDao(IBaseDAO<Userinfo> baseDao){
		this.baseDao = baseDao;
	}
	public IBaseDAO<Userinfo> getBaseDao(){
		return this.baseDao;
	}
	/**
	 * ¸ù¾ÝuserId²éÑ¯
	 * @param id
	 * @return
	 * @throws HibernateException
	 */
	public Userinfo getUserById(int id) throws HibernateException {
		List<Userinfo> userinfo= baseDao.findByProperty("userid", id);
		return userinfo.get(0);
	}
	public Userinfo getUserByHql(String name, String password) throws HibernateException{
		Userinfo user = null;
		List<Userinfo> result =baseDao.findByProperty("name", name);
		if(result.size() == 1 && result.get(0).getPassword().equals(password)){
			user = result.get(0);
		}
		return user;
	}
	public void saveUser(Userinfo user) throws HibernateException {
		baseDao.add(user);
	}
}
