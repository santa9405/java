package com.kh.practice.view;

import java.util.ArrayList;
import java.util.List;
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
		// 전체 학생 정보를 List로 반환 받아 화면에 출력
		List<Student> students = service.selectAll();

		System.out.println("========== 전체 학생 조회 ==========");

		// 향상된 for문
		for (Student std : students) {
			System.out.println(std);
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

		Student std = service.selectName(name);
		if (std == null)
			System.out.println("일치하는 학생이 없습니다.");
		else
			System.out.println(std);

	}

	// 성별 검색 view
	@Override
	public void selectGender() {
		// 성별이 일치하는 학생이 있는지 검색하기 위해
		// 성별을 입력받아 service.selectGender(입력받은성별)를 호출하고
		// 결과를 List 타입으로 받아 for문을 이용하여 출력.

		System.out.print("[성별 검색]검색할 성별 입력(M/F) : ");
		char gender = sc.nextLine().charAt(0);

		if (gender == 'M' || gender == 'F') {
			System.out.println("[성별 검색 결과]");

			List<Student> students = service.selectGender(gender);

			for (Student std : students) {
				System.out.println(std);
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
		// 결과를 List 타입으로 받아 for문을 이용하여 출력.
		// 단, 전달받은 List의 길이가 0일 경우
		// "나이가 일치하는 학생이 없습니다." 출력

		System.out.print("[나이 검색]검색할 나이 입력 : ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.println("[나이 검색 결과]");
		List<Student> students = service.selectAge(age);
		
		//if(students.size() == 0) { // 객체 개수 0
		if (students.isEmpty() != true) { // 객체가 있을 때

			for (Student std : students) {
				System.out.println(std);
			}
		}else {
			System.out.println("나이가 일치하는 학생이 없습니다.");
		}
		

	}

	// 학생 정보 추가 view
	@Override
	public void insertStudent() {
		// 이름, 나이, 성별을 입력받아 Student 객체를 생성하고,
		// service.insertStudent(생성한 Student객체)를 호출하여 삽입.
		// (반환값 없음)
		System.out.println("[학생 정보 추가]");
		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);
		
		service.insertStudent(new Student(name, age, gender));

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

		Student std = service.selectName(name);

		if (std == null) {
			System.out.println("일치하는 학생이없습니다.");
		} else {
			System.out.println("[학생 정보 수정]");
			System.out.print("이름 입력 : ");
			String updateName = sc.nextLine();

			System.out.print("나이 입력 : ");
			int age = sc.nextInt();
			sc.nextLine();

			System.out.print("성별 입력 : ");
			char gender = sc.nextLine().charAt(0);
			
			service.updateStudent(name, new Student(updateName, age, gender));

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
		
		if(std == null) { // 삭제 실패
			System.out.println("일치하는 학생이 없습니다.");
		}else { // 삭제 성공
			System.out.println(std + "삭제되었습니다.");
		}

	}

}
