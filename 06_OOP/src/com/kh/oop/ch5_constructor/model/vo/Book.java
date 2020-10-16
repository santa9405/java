package com.kh.oop.ch5_constructor.model.vo;

public class Book {
	// 속성 (필드)
	private String title; // 책 제목
	private String author; // 저자
	private String content; // 내용
	private String publisher; // 출판사
	private int price; // 가격
	
	// 기능(메소드)
	
	// 생성자
	// 기본 생성자 : 매개변수가 없는 생성자
	public Book() {
		// 클래스 내에 다른 생성자가 하나도 작성되지 않은 경우
		// 컴파일 시 자동으로 기본 생성자가 추가됨
		System.out.println("Book() 기본 생성자로 생성됨.");
	}
	
	// 매개 변수가 있는 생성자
	// 객체 생성 시 전달받은 값을 객체 필드 초기화 용으로 사용
	// 자동 생성되지 않고, 개발자 필요에 의해서 작성되는 생성자
	public Book(String title, String author, String content, 
			String publisher, int price) { // 다섯개의 값을 전달 받아라
		
		// this() 생성자
		// 같은 클래스 내에서 다른 생성자를 부를 때 사용
		// - 이점 : 코드 길이 감소, 생성자 재사용성 증가
		this(title, author, price);
		this.content = content;
		this.publisher = publisher;

	}
	
	// 오버로딩 : 한 클래스 내에 동일한 메소드 이름으로 여러 개 작성하는 기법
	// 조건 1) 메소드명 동일
	// 조건 2) 매개변수의 개수, 타입, 순서가 달라야 함
	
	public Book(String title, String author, int price) {
		// 매개변수 3개, String, String, int 순서
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public Book(String title, String author) {
		// 매개변수가 개수 감소( 3 -> 2 )
	}
	
	public Book(String title, String author, String content) {
		// 마지막 매개 변수 타입 변경(int -> String)
	}
	
	public Book(int price, String title, String author) {
		// 매개변수 순서 변경. (String, String, int -> int, String, String)
	}
	
	/* public Book(String content, String publisher, int price) {
		// 매개변수 변수명 변경 -> 에러 발생!
		// -> 오버로딩 시 매개변수명은 중요하지 않으므로 타입만 보면 됨!
	} */
	
	
	// getter/setter
	// title setter
	public void setTitle(String title) {
		this.title = title; // 자바의 정석
	} // title 멤버 변수에 저장 해라
	
	// title getter
	public String getTitle() {
		return title;
	}
	
	// content setter
	public void setContent(String content) {
		this.content = content;
	}
	
	// content getter
	public String getContent() {
		return content;
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






	@Override // 필드 정보를 하나의 문자열로 반환
	public String toString() { 
		return "Book [title=" + title + ", author=" + author + ", content=" + content + ", publisher=" + publisher
				+ ", price=" + price + "]";
	}
	
	// getter / setter 자동 생성
	// alt + shift + s -> r
	
	// toString() 메소드 자동
	// alt + shift + s -> s
	
	
	
	
	
	
	
	
}
