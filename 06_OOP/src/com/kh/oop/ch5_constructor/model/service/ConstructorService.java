package com.kh.oop.ch5_constructor.model.service;

import com.kh.oop.ch5_constructor.model.vo.Book;

public class ConstructorService {
	public void example() {
		// 기본 생성자를 이용한 Book 객체 생성
		Book book1 = new Book();
		System.out.println(book1.toString());
		book1.setTitle("자바의 정석");
		book1.setAuthor("남궁 성");
		book1.setContent("자바 공부 하라는 내용");
		book1.setPublisher("도우출판");
		book1.setPrice(30000);

		System.out.println(book1.toString());

		Book book2 = new Book("어린왕자", "생택쥐베리", "어린왕자 연대기", "도우출판", 500);
		System.out.println(book2.toString());

	}

	// 메소드 이름, 형태가 동일한 메소드는 중복 작성할 수 없다
	// public void example() { }

}
