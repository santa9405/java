package com.kh.api.model.vo;

public class Book extends Object {
	// 컴파일 할 때 자동으로 생성됨
	private String title;
	private String author;
	private int price;

	public Book() {
	}

	// 매개변수 있는 생성자
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;

	}

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	// getter / setter
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() { // 객체가 가지고 있는 멤버변수 출력
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	// Object.equals() 오버라이딩
	// - equals() 오버라이딩 목적 : 두 객체의 값이 같은지를 비교하는 목적으로 사용
	// (동등비교)

	// - 오버라이딩 전 : 두 객체의 주소값이 같으면 true, 아니면 false

	@Override
	public boolean equals(Object obj) {

		// 전달받아온 객체가 Book 타입이 맞는지 확인
		if (!(obj instanceof Book)) {
			return false;
		}

		// instanceof를 통해 Book 객체가 맞다는걸 확인한 경우
		// obj 참조변수를 Book 형태로 다운캐스팅하여
		// other 참조변수에 얕은복사(주소복사)
		Book other = (Book) obj;

		if (!this.title.equals(other.title)) {
			// 두 객체의 title이 같지 않을 경우
			return false;
		}

		else if (!this.author.equals(other.author)) {
			// 두 객체의 author이 같지 않을 경우
			return false;
		} else if (this.price != other.price) {
			// 두 객체의 price가 같지 않을 경우
			return false;
		}

		// 다 같은 경우 true를 돌려보냄
		return true;

	}
	
	// Object.hashCode() 메소드 오버라이딩
	// - hashCode() 오버라이딩 목적 : 두 객체의 형태가 일치하는지를 비교하는 목적으로 사용
	//								(동일 비교)
	
	// - hashCode() 오버라이딩 방법
	// -> 멤버변수에 저장되어있는 데이터를 이용해서
	//	     다른 객체와 중복되지 않는 값을 반환하게 만듦
	@Override
	public int hashCode() {
		int result = 1;
		final int prime = 31; // 17 또는 31
		
		result = result * prime + 
				((title == null) ? 0 : title.hashCode());

		result = result * prime + 
				((author == null) ? 0 : author.hashCode());
	
		result = result * prime + price;
		
		return result;
	}
	

	
	
	
	
	
}
