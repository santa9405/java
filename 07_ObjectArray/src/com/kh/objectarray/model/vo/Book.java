package com.kh.objectarray.model.vo;

public class Book {
	// 필드(멤버변수, 클래스변수)
	private String title;
	private String author;
	private String publisher;
	private int price;
	
	// 생성자
	// 기본 생성자
	public Book() { }
	
	// 매개변수 있는 생성자 == 객체를 만들 때부터 초기값을 준다
	public Book(String title, String author, String publisher, int price) { // 멤버변수에 초기화할 수 있음
		this(title, author);
		this.publisher = publisher;
		this.price = price;
		
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		
		
		
	}
	
	// 메소드
	// getter/setter
	// title getter
	public String getTitle() {
		return title;
	}
	
	// title setter
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// 객체 필드 정보 반환용 메소드
	public String information() {
		return title + " / " + author + " / " +
				publisher + " / " + price + "원";
			// 자바의정석 / 남궁 성 / 도우 출판 / 30000원
		
	}
	
}
