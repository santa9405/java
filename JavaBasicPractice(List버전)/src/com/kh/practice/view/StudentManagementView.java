package com.kh.practice.view;

import java.util.Scanner;

import com.kh.practice.model.service.StudentManagementServiceImpl;

public abstract class StudentManagementView {
	private Scanner sc = new Scanner(System.in);
	
	public void	displayMainMenu() {
		int sel = 0;
		
		do {
			System.out.println();
			System.out.println(""
					+ " = 학생 정보 관리 프로그램 =\n"
					+ "|   1. 전체 학생 조회      |\n"
					+ "|   2. 특정 조건 검색      |\n"
					+ "|   3. 학생 정보 추가      |\n"
					+ "|   4. 학생 정보 수정      |\n"
					+ "|   5. 학생 정보 삭제      |\n"
					+ "|   0. 프로그램 종료       |\n"
					+ " ------------------"
					);
			
			System.out.print("메뉴 선택 : ");
			sel = sc.nextInt();
			sc.nextLine();
			
			System.out.println();
			switch(sel) {
			case 1 : selectAll(); break;
			case 2 : subMenu(); break;
			case 3 : insertStudent(); break;
			case 4 : updateStudent(); break;
			case 5 : deleteStudent(); break;
			case 0 : System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			
		}while(sel != 0);
	}
	
	
	// 특정 조건 검색 서브메뉴 View
	public void subMenu() {
		int sel = 0;
		boolean flag = false;
		
		do {
			flag = false;
			System.out.println("========== 특정 조건 검색 ==========");
			System.out.println("1. 이름으로 검색");
			System.out.println("2. 성별 검색");
			System.out.println("3. 나이 검색");
			System.out.println("0. 메인 메뉴로 돌아가기");
			System.out.print("조건 선택 : ");
			sel = sc.nextInt();
			sc.nextLine();
			
			System.out.println();
			switch(sel) {
			case 1 : selectName(); break;
			case 2 : selectGender(); break;
			case 3 : selectAge(); break;
			case 0 : System.out.println("메인 메뉴로 돌아갑니다."); break;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				flag = true;
			}
			
		}while(sel != 0 && flag);
	}
	
	

	// 전체 학생 조회 view
	// service.selectAll() 메소드를 호출하여
	// 전체 학생 정보를 Student[]로 반환 받아 화면에 출력 
	public abstract void selectAll();
	
	
	
	// 이름 검색 view
	// 이름이 일치하는 학생이 있는지 검색하기 위해
	// 이름을 입력받아  service.selectName(입력받은이름)를 호출하고
	// 결과를 List 타입으로 받음.
	// 결과가 null이 아닐경우 검색 결과 출력,
	// 결과가 null일 경우 "일치하는 학생이 없습니다." 출력
	public abstract void selectName();
	
	
	// 성별 검색 view
	// 이름이 일치하는 학생이 있는지 검색하기 위해
	// 이름을 입력받아  service.selectGender(입력받은성별)를 호출하고
	// 결과를 List 타입으로 받아 for문을 이용하여 출력.
	public abstract void selectGender();
	
	// 나이 검색 view
	// 나이가 일치하는 학생이 있는지 검색하기 위해
	// 나이를 입력받아  service.selectAge(입력받은나이)를 호출하고
	// 결과를 List 타입으로 받아 for문을 이용하여 출력.
	// 단, 전달받은  List의 길이가 0일 경우
	// "나이가 일치하는 학생이 없습니다." 출력
	public abstract void selectAge();
	
	
	// 학생 정보 추가 view
	// 이름, 나이, 성별을 입력받아 Student 객체를 생성하고,
	// service.insertStundet(생성한 Student객체)를 호출하여 삽입.
	// (반환값 없음)
	public abstract void insertStudent();
	
	
	// 학생 정보 수정 view
	// 수정할 학생의 이름을 입력받고 이름이 일치하는 학생의 유무를 판단위해 
	// service.selectName(검색할 이름)을 호출하여 Student 타입을 반환 받음.
	// 일치하는 학생이 없을 경우 "일치하는 학생이없습니다." 출력 후 메소드 종료.
	
	// 일치하는 학생이 존재할 경우 이름, 나이 ,성별을 입력받아 Student 객체를 생성하고
	// service.updateStudent(검색할 이름, 생성한 학생객체)하여 학생 정보를 수정.
	// (반환값 없음)
	public abstract void updateStudent();
	
	
	// 학생 정보 삭제 view
	// 삭제할 학생의 이름을 입력 받아
	// service.deleteStudent(입력받은학생이름)을 호출하고
	// Student 타입을 반환 받아
	// 삭제 성공 시 삭제된 학생 정보 + " 삭제되었습니다.,
	// 삭제 실패 시 "일치하는 학생이 없습니다." 출력
	public abstract void deleteStudent();
	
	
	
}
