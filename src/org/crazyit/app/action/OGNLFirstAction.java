package org.crazyit.app.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class OGNLFirstAction extends ActionSupport {

	/**
	 * @return
	 */
	public String execute() {
		// TODO Auto-generated method stub
		ActionContext ctx = ActionContext.getContext();
		ctx.put("u1",new User("Jane",23));
		ctx.put("msg", "值栈信息");
		
		ctx.getSession().put("msg", "值栈信息session");
		ctx.getApplication().put("msg", "值栈信息app");
		
		
		ValueStack vs=ctx.getValueStack();
		vs.set("msg","值栈直接压入信息"); 
		vs.push(new User("哈哈",12));

		return SUCCESS;
	}
	
	class User{
		public User(String name,int age){
			this.name = name;
			this.age = age;
		}
		public String name;
		public int age;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
	}
}