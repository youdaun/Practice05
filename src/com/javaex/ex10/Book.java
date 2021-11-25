package com.javaex.ex10;

public class Book {

	private int bookNo; // 번호
	private String title; // 제목
	private String author; // 작가
	private int stateCode; // 상태코드(대여유무)

	//생성자
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}
	
	//메소드
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	// 메소드 일반
	public void rent() {
		stateCode = 0;
		System.out.println(title + "이(가) 대여 됐습니다.");
	}
	
	public void print() {
		if(stateCode == 1) {
			System.out.println(bookNo + " 책 제목:" + title + ", 작가:" + author + " *재고있음");
		}
		else {
			System.out.println(bookNo + " 책 제목:" + title + ", 작가:" + author + " *대여중");
		}
		
	}
	
	
	
	
	
	
	
}
