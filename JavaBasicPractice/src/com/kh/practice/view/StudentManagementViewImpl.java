package com.kh.practice.view;

import java.util.Scanner;

import com.kh.practice.model.service.StudentManagementService;
import com.kh.practice.model.service.StudentManagementServiceImpl;
import com.kh.practice.model.vo.Student;

public class StudentManagementViewImpl extends StudentManagementView {

	private Scanner sc = new Scanner(System.in);
	private StudentManagementService service = new StudentManagementServiceImpl();

	// 전체 학생 조회 view
	@Override
	public void selectAll() {
		// service.selectAll() 메소드를 호출하여
		// 전체 학생 정보를 Student[]로 반환 받아 화면에 출력
		// 단, 배열 요소의 참조값이 null이면 출력 반복문 종료

		// service.selectAll 하면 students 객체 배열이 반환된다
		// 즉 service.selectAll = students(Student[])
		System.out.println("========== 전체 학생 조회 ==========");
		for (int i = 0; i < service.selectAll().length; i++) {
			if (service.selectAll()[i] == null) {
				break;
			}
			System.out.println(service.selectAll()[i].toString());
		}
	}

	// 이름 검색 view
	@Override
	public void selectName() {
		// 이름이 일치하는 학생이 있는지 검색하기 위해
		// 이름을 입력받아 service.selectName(입력받은이름)를 호출하고
		// 결과를 Student 타입으로 받음.
		// 결과가 null이 아닐경우 검색 결과 출력,
		// 결과가 null일 경우 "일치하는 학생이 없습니다." 출력

		System.out.print("[이름 검색]검색할 학생 이름 입력 : ");
		String name = sc.nextLine();

		if (service.selectName(name).getName() == null) {
			System.out.println("일치 하는 학생이 없습니다.");
		} else {
			System.out.println("[검색 결과]" + service.selectName(name).toString());
		}

	}

	// 성별 검색 view
	@Override
	public void selectGender() {
		// 이름이 일치하는 학생이 있는지 검색하기 위해
		// 이름을 입력받아 service.selectGender(입력받은성별)를 호출하고
		// 결과를 Student[] 타입으로 받아 for문을 이용하여 출력.
		// 성별을 잘못 입력한 경우 "잘못 입력하셨습니다. (M 또는 F만 입력해주세요.)" 출력

		System.out.print("[성별 검색]검색할 성별 입력 : ");
		char input = sc.nextLine().charAt(0);

		if (input == 'M' || input == 'F') {

			System.out.println("[성별 검색 결과]");
			for (int i = 0; i < service.selectGender(input).length; i++) {
				if (service.selectGender(input)[i] == null) {
					break;
				}
				System.out.println(service.selectGender(input)[i].toString());
			}

		} else {
			System.out.println("잘못 입력하셨습니다. (M 또는 F만 입력해주세요.)");
		}
	}

	// 나이 검색 view
	@Override
	public void selectAge() {
		// 나이가 일치하는 학생이 있는지 검색하기 위해
		// 나이를 입력받아 service.selectAge(입력받은나이)를 호출하고
		// 결과를 Student[] 타입으로 받아 for문을 이용하여 출력.
		// 단, 전달받은 Student[]의 길이가 0일 경우
		// "나이가 일치하는 학생이 없습니다." 출력
		
		
		System.out.print("[나이 검색]검색할 나이 입력 : ");
		int input = sc.nextInt();
		
		if (service.selectAge(input).length != 0) {
		
			
		System.out.println("[나이 검색 결과]");
		for (int i = 0; i < service.selectAge(input).length; i++) {
			if (service.selectAge(input)[i]== null) {
				break;
			}
			System.out.println(service.selectAge(input)[i].toString());
		}

	}else {
		System.out.println("나이가 일치하는 학생이 없습니다.");
		}	
	}

	// 학생 정보 추가 view
	@Override
	public void insertStudent() {
		// 이름, 나이, 성별을 입력받아 Student 객체를 생성하고,
		// service.insertStundet(생성한 Student객체)를 호출하여 삽입.
		// (반환값 없음)
		
		System.out.println("[학생 정보 추가]");
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별을 입력해주세요 : ");
		char gender = sc.nextLine().charAt(0);
		
		Student std = new Student(name, age, gender);
		
		service.insertStudent(std);
		
		
	}

	// 학생 정보 수정 view
	@Override
	public void updateStudent() {
		// 수정할 학생의 이름을 입력받고 이름이 일치하는 학생의 유무를 판단위해
		// service.selectName(검색할 이름)을 호출하여 Student 타입을 반환 받음.
		// 일치하는 학생이 없을 경우 "일치하는 학생이없습니다." 출력 후 메소드 종료.

		// 일치하는 학생이 존재할 경우 이름, 나이 ,성별을 입력받아 Student 객체를 생성하고
		// service.updateStudent(검색할 이름, 생성한 학생객체)하여 학생 정보를 수정.
		// (반환값 없음)
		
		System.out.print("[수정 학생 이름 검색] 입력 : ");
		String name = sc.nextLine();
		
		if (service.selectName(name) == null) {
			System.out.println("일치하는 학생이 없습니다.");
		}else {
			System.out.println("[학생 정보 수정]");
			System.out.print("이름 입력 : ");
			String updateName = sc.nextLine();
			System.out.print("나이 입력 : ");
			int updateAge = sc.nextInt();
			sc.nextLine();
			System.out.print("성별 입력 : ");
			char updateGender = sc.nextLine().charAt(0);
			Student std = new Student(updateName, updateAge, updateGender);
			service.updateStudent(name, std);
		}
		
		

	}

	// 학생 정보 삭제 view
	@Override
	public void deleteStudent() {
		// 삭제할 학생의 이름을 입력 받아
		// service.deleteStudent(입력받은학생이름)을 호출하고
		// Student 타입을 반환 받아
		// 삭제 성공 시 삭제된 학생 정보 + " 삭제되었습니다.,
		// 삭제 실패 시 "일치하는 학생이 없습니다." 출력

		System.out.print("[학생 정보 삭제]삭제할 학생 이름 : ");
		String name = sc.nextLine();
		
		Student std = service.deleteStudent(name);
		
		if(std == null) {
			System.out.println("일치하는 학생이 없습니다.");
		}else {
			System.out.println(std + "삭제되었습니다." );
		}
		
	}

}
