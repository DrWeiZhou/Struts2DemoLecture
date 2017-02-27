package org.crazyit.app.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport
{
	//锟斤拷锟斤拷锟阶帮拷锟斤拷锟斤拷锟斤拷锟絬sername锟斤拷password锟斤拷锟斤拷
	private String username;
	private String password;
	private String tip;
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	//锟斤拷锟藉处锟斤拷锟矫伙拷锟斤拷锟斤拷锟絜xecute锟斤拷锟斤拷
	public String execute() throws Exception
	{
		//锟斤拷username为crazyit.org锟斤拷password为leegang时锟斤拷锟斤拷录锟缴癸拷
		if (getUsername().equals("qtech")
			&& getPassword().equals("java") )
		{
			ActionContext.getContext().getSession()
				.put("user" , getUsername());
			setTip("欢迎," + getUsername() + ",您已经登录成功!!!");
		return SUCCESS;
		}
		else
		{
			return ERROR;
		}
	}
}