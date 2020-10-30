package com.kh.noticeBoard.view;

import java.util.Scanner;

public abstract class BoardView {
	Scanner sc = new Scanner(System.in);
	
	public void	displayMainMenu() {
		int sel = 0;
		do {
			System.out.println("--------------------------------------");
			System.out.println("1. 전체 게시글 조회");
			System.out.println("2. 특정 조건 검색");
			System.out.println("3. 게시글 추가");
			System.out.println("4. 게시글 수정");
			System.out.println("5. 게시글 삭제");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 선택 : ");
			sel = sc.nextInt();
			sc.nextLine();
			System.out.println("--------------------------------------");
			
			switch(sel) {
			case 1 : viewAll(); break;
			case 2 : subMenu(); break;
			case 3 : createBoard(); break;
			case 4 : updateBoard(); break;
			case 5 : deleteBoard(); break;
			case 0 : System.out.println("프로그램 종료"); break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
		}while(sel != 0);
	}
	


	public void subMenu() {
		int sel = 0;
		do {
			System.out.println("--------------------------------------");
			System.out.println("1. 제목으로 검색");
			System.out.println("2. 작성자로 검색");
			System.out.println("0. 메인메뉴로");
			
			System.out.print("메뉴 선택 : ");
			sel = sc.nextInt();
			sc.nextLine();
			System.out.println("--------------------------------------");
			
			switch(sel) {
			case 1 : selectTitle(); break;
			case 2 : selectAuthor(); break;
			case 0 : System.out.println("메인메뉴로 돌아갑니다."); break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
		}while(sel != 0);
	}
	
	// 전체 게시물을 조회하는 기능
	public abstract void viewAll();
	
	// 게시글 생성 기능
	public abstract void createBoard();
	
	// 게시글 수정 기능
	public abstract void updateBoard();
	
	// 게시글 삭제 기능
	public abstract void deleteBoard();
	
	// 제목을 통해서 게시글을 검색하는 기능
	public abstract void selectTitle();
	
	// 작성자를 통해 게시글을 검색하는 기능
	public abstract void selectAuthor();	
}
