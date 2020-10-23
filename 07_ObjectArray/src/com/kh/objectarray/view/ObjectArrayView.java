package com.kh.objectarray.view;

import java.util.Scanner;

import com.kh.objectarray.model.service.ObjectArrayService;

public class ObjectArrayView {
	
	// MVC Model2 디자인 패턴
	// Model : 데이터, 로직 처리 (비즈니스 로직 처리 담당)
	// View : 클라이언트의 요청(입력), 응답(출력) 담당
	// Controller : 요청의 종류에 따라 Service를 결정하고
	//				결과를 알맞은 view로 연결 담당
	
	// 클래스 내부에서 스캐너를 모두 사용할 수 있게 멤버 변수로 선언
	private Scanner sc = new Scanner(System.in);
	
	// 클래스 내부에서 ObjectArrayService 객체를 모두 사용할 수 있게 멤버 변수로 선언
	private ObjectArrayService service = new ObjectArrayService();
	
	// 메인 메뉴
	public void displayView() {
		int sel = 0; // 메뉴 번호를 입력받을 임시 변수
		do {
			System.out.println("========== 메뉴 ==========");
			System.out.println("1. 전체 책 정보 조회");
			System.out.println("2. 책 제목 검색");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			sel = sc.nextInt();
			sc.nextLine(); // 버퍼에 남아있는 개행문자 제거
			
			switch (sel) {
			case 1 : System.out.println(service.selectAll()); break;
			case 2 : System.out.println( searchTitle() ); break;
			case 0 : System.out.println("프로그램 종료"); break;
			default : System.out.println("잘못 입력하셨습니다.");
			
			}
			
			System.out.println(); // 줄바꿈
			
		}while(sel != 0);
		
	}
	
	// 제목 검색용 View
	public String searchTitle() {
		
		System.out.print("검색할 책 제목 입력 : ");
		String title = sc.nextLine();
		
		System.out.println("----- 검색 결과 -----");
		
		String str = service.searchTitle(title); // 결과 반환용 변수
		
		if(str == null) {
			str = "해당 제목의 책이 존재하지 않습니다.";
		}

		return str;
	}

}
