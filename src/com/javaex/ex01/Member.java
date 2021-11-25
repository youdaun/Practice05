package com.javaex.ex01;

public class Member {

	//필드
	private String id;
	private String name;
	private int point;
	
	
	//생성자

	//메소드(g/s)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	//메소드(일반)
	public void showInfo() {
		System.out.println("회원정보: " + name + "(" + id + ")" + ", " + point + "점");
	}
}
