package org.crazyit.app.action;

import java.util.Map;

public class Person {
	private String name;
	private int age;
	private Cat cat;
	private String[] friends;
	private Map<String,String> map;
	
	/**
	 * @param name
	 * @param age
	 * @param cat
	 * @param friends
	 * @param map
	 */
	public Person(String name,int age,Cat cat,String[] friends, Map map){
		setName(name);
		setAge(age);
		setCat(cat);
		setFriends(friends);
		setMap(map);
	}
	
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
	public Cat getCat() {
		return cat;
	}
	public void setCat(Cat cat) {
		this.cat = cat;
	}
	public String[] getFriends() {
		return friends;
	}
	public void setFriends(String[] friends) {
		this.friends = friends;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	
	public String function1(){
		return "function 1 invoked!";
	}
	
	public static String staticFunction(int x){
		return "static function invoked "+ x;
	}
	
}
