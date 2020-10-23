package com.kh.objectarray.model.service;

import com.kh.objectarray.model.vo.Book;

public class ObjectArrayService {
	
	// Service 클래스 내 어디서든 사용 가능한 
	// Book 객체 배열 선언 및 할당, 초기화
	private Book[] books = { new Book("자바의정석", "남궁 성", "도우출판", 30000),
							 new Book("어린왕자", "생택쥐베리", "교학사", 8000),
							 new Book("자바 쉽죠?", "백동현", "KH출판", 100000),
							 new Book("개미", "베르나르 베르베르", "교보문고", 12000),
							 new Book("보리 국어사전", "토박이 사전 편찬실", "토박이", 63000)
							}; // 명시적 초기화
	
	// 객체 생성 시 초기화 순서
	// JBM 기본값 -> 명시적 초기화 -> 초기화 블럭 -> 생성자
	
	// 기본 생성자
	public ObjectArrayService() {  }
	// 생성자에서 필드 초기화를 진행하지 않으면
	// 명시적 초기화 내용이 유지됨
	
	// 저장된 책 정보를 모두 조회해 String 형태로 반환하는 메소드
	public String selectAll() {
		String str = ""; // 빈 문자열
		
		for(int i=0; i<books.length; i++) { // 0 ~ 4 까지
			str += books[i].information() + "\n"; // 비어있는 문자열에 책정보를 한줄로 연결 하고 str로 돌아가라
		}
		
		return str;
	}

	//객체 배열에 입력받은 제목의 책이 있는지 검사하여 책 정보 반환
	public String searchTitle(String title) {
								// 입력한 책 제목을 전달받은 매개변수
		String str = null;
		
		for(int i=0; i<books.length; i++) {
			if( books[i].getTitle().equals(title) ) {
				// books 배열 요소 중 제목이 title과 일치하는 요소가 있다면
				// 해당 요소의 정보(information())를 str에 대입
				str = books[i].information();
			}
		}

		return str;
	}
			
}
