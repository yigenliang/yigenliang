package ssh.service;

import org.hibernate.HibernateException;
import ssh.hibernate.pojo.Userinfo;

public interface UserService{
	public Userinfo getUserById(int id) throws HibernateException;
	public Userinfo getUserByHql(String name, String password) throws HibernateException;
	public void saveUser(Userinfo user) throws HibernateException;
}
