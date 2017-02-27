package org.crazyit.app.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class OGNLAction extends ActionSupport {
	private ArrayList list = new ArrayList();
	
	public ArrayList getList() {
		return list;
	}

	public void setList(ArrayList list) {
		this.list = list;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat("cat1",10);
		Cat cat2 = new Cat("cat2",8);
		
		String[] friends1 = {"friend1","friends2","friends3"};
		String[] friends2 = {"friend4","friends5","friends6"};

		Map<String, String> map1 = new HashMap<String,String>();
		map1.put("key1", "value1");
		map1.put("key2", "value2");
		map1.put("key3", "value3");
		
		Map<String, String> map2 = new HashMap<String,String>();
		map2.put("key4", "value4");
		map2.put("key5", "value5");
		map2.put("key6", "value6");

		Person p1 = new Person("zhangsan",23,cat1,friends1,map1);
		Person p2 = new Person("lisi",27,cat2,friends2,map2);
		
		list.add(p1);
		list.add(p2);
		
		ActionContext ctx = ActionContext.getContext();
		ctx.put("msg", "值栈信息！");
		
		ValueStack vs=ctx.getValueStack();
		vs.set("msg","值栈直接压入信息");
		vs.push("hahaha");


		return SUCCESS;
	}
}
