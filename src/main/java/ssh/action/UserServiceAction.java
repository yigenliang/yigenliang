package ssh.action;

import java.util.Map;

import ssh.hibernate.pojo.Userinfo;
import ssh.service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserServiceAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String password;
	private String newPassword;
	private UserService userService;
	
	public UserService getUserService(){
		return this.userService;
	}
	public void setUserService(UserService usd){
		this.userService = usd;
	}
	
	public String getNewPassword(){
		return this.newPassword;
	}
	public void setNewPassword(String newPassword){
		this.newPassword = newPassword;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String execute() throws Exception{
		System.out.println("execute");
		return SUCCESS;
	}
	public String login() throws Exception{
		System.out.println("login");
		return SUCCESS;
	}
	public void validateLogin() throws Exception{
		System.out.println("validate");
		Userinfo result = userService.getUserByHql(name, password);
		System.out.println("here");
		if(result == null){
			this.addFieldError("message", "wrong user info");
		}else{
			Map<String, Object> session = ActionContext.getContext().getSession();
			session.put("user", result);
		}
	}
	public String logout() throws Exception{
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put("user", null);
		return SUCCESS;
	}
	//TODO 修改个人信息 和找回密码
	public String changePersonalInfo() throws Exception{
		return SUCCESS;
	}
	public String getPwd(){
		return SUCCESS;
	}
}
