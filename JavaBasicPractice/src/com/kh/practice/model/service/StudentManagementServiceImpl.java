package com.kh.practice.model.service;

import java.util.jar.Attributes.Name;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.kh.practice.model.vo.Student;

public class StudentManagementServiceImpl implements StudentManagementService {
	private Student[] students = { new Student("강보령", 30, 'F'), new Student("강성혁", 27, 'M'),
			new Student("강수정", 27, 'F'), new Student("고보석", 26, 'M'), new Student("김만희", 29, 'M'),
			new Student("김성령", 28, 'F'), new Student("김영주", 28, 'M'), new Student("김정민", 26, 'M'),
			new Student("김정화", 25, 'F'), new Student("김정훈", 26, 'F'), new Student("김태우", 28, 'M'),
			new Student("김현혜", 27, 'F'), new Student("민경목", 26, 'M'), new Student("박영현", 28, 'F'),
			new Student("박지호", 24, 'M'), new Student("박혜윤", 28, 'F'), new Student("박희도", 32, 'M'),
			new Student("신주희", 26, 'F'), new Student("유지권", 27, 'M'), new Student("유현재", 27, 'M'),
			new Student("이솔이", 31, 'F'), new Student("이정아", 25, 'F'), new Student("이준호", 29, 'M'),
			new Student("이진선", 22, 'F'), new Student("이한솔", 27, 'F'), new Student("임소리", 25, 'F'),
			new Student("정연정", 25, 'F'), new Student("조유림", 26, 'F'), new Student("최순영", 25, 'M') };

	// 현재 students 배열의 마지막 값이 저장된 인덱스값을 저장하는 변수
	private int currentIndex = students.length - 1;

	// 전체 학생 정보가 담겨있는 배열을 반환하는 service
	@Override
	public Student[] selectAll() {

		return students; // 배열의 주소 반환
	}

	// students 객체 배열에서 이름이 일치하는 학생 객체 반환하는 service
	// 일치하는 학생이 없으면 null 반환 (동명이인은 없다고 가정)
	@Override
	public Student selectName(String name) {
		Student std = null; // 결과를 저장하기 위한 참조변수 선언

		// for(int i=0; i<students.length; i++) {
		for (int i = 0; i <= currentIndex; i++) {
			if (students[i].getName().contentEquals(name)) {
				std = students[i];
				break; // 동명이인이 없다고 가정되어 있으므로 추가 검색이 필요 없음
			}
		}

		/*
		 * for (int i = 0; i < students.length; i++) { if
		 * (students[i].getName().equals(name)) { return students[i]; } }
		 */
		return std;
	}

	// students 객체 배열에서 전달받은 gender와 성별이 일치하는 학생을 Student 배열로 반환하는 service
	@Override
	public Student[] selectGender(char gender) {

		// 검색 결과를 저장할 배열 선언
		// 1) students 배열 크기와 동일한 새로운 배열 생성 -> 속도는 빠르나 메모리 효율이 떨어짐
		// 2) 입력받은 gender와 일치하는 요소의 개수만큼의 크기를 가진 새로운 배열 생성 -> 속도가 느리나 메모리 효율이 우수함 / 실무에서
		// 많이 쓰임

		// 성별이 일치하는 요소의 개수를 count
		int count = 0;
		for (int i = 0; i <= currentIndex; i++) { // 값이 입력된 부분까지 검사
			if (students[i].getGender() == gender) {
				count++;
			}
		}

		Student[] newArr = new Student[count]; // 성별이 일치하는 만큼 배열 크기 선언

		int index = 0; // 새로운 배열에 데이터가 들어가야될 부분을 가리키는 용도
		// 실제 데이터가 있는 인덱스 + 1
		for (int i = 0; i <= currentIndex; i++) { // 값이 입력된 부분까지 검사
			if (students[i].getGender() == gender) {
				newArr[index++] = students[i];
			}
		}

		/*
		 * Student[] newObjectArr = new Student[students.length];
		 * 
		 * int currentIndex = 0; for (int i = 0; i < students.length; i++) { if
		 * (students[i].getGender() == gender) { newObjectArr[currentIndex] =
		 * students[i]; currentIndex++; } }
		 */

		return newArr;

	}

	// students 객체 배열에서 전달받은 age와 나이가 일치하는 학생을 Student 배열로 반환하는 service
	// 일치하는 학생이 없으면 null 반환
	@Override
	public Student[] selectAge(int age) {

		// 나이가 일치하는 요소의 개수를 count
		int count = 0;
		for (int i = 0; i <= currentIndex; i++) { // 값이 입력된 부분까지 검사
			if (students[i].getAge() == age) {
				count++;
			}
		}

		Student[] newArr = new Student[count]; // 0칸짜리 배열도 가능, 나이가 일치하는 만큼 배열 크기 선언

		int index = 0; // 새로운 배열에 데이터가 들어가야될 부분을 가리키는 용도
		// 실제 데이터가 있는 인덱스 + 1
		for (int i = 0; i <= currentIndex; i++) { // 값이 입력된 부분까지 검사
			if (students[i].getAge() == age) {
				newArr[index++] = students[i];
			}
		}

		return newArr;

		/*
		 * Student[] newObjectArr = new Student[students.length];
		 * 
		 * int currentIndex = 0; for (int i = 0; i < students.length; i++) { if
		 * (students[i].getAge() == age) { newObjectArr[currentIndex] = students[i];
		 * currentIndex++; } }
		 * 
		 * return newObjectArr;
		 */
	}

	// 전달받은 Student 객체를 Student[] 배열인 students에 추가
	// 만약 students 배열의 크기가 부족할 경우 2배로 증가시킨 후 추가.
	@Override
	public void insertStudent(Student std) {

		// 배열 크기 검사
		if (students.length - 1 == currentIndex) {
			// students의 마지막 인덱스 == 마지막 데이터 인덱스 위치
			// == 배열이 꽉 참 --> 2배 큰 새로운 배열 생성 후 깊은복사 + 얕은복사

			Student[] newArr = new Student[students.length * 2];

			// 기존 배열 데이터 -> 신규 배열로 깊은복사
			System.arraycopy(students, 0, newArr, 0, students.length);

			// 얕은복사(신규 배열 주소를 students에 저장)
			students = newArr;
		}

		students[++currentIndex] = std;

		// students의 마지막 인덱스

		// private int currentIndex = students.length - 1;
		/*
		 * if (currentIndex == students.length - 1) { Student[] newArr = new
		 * Student[students.length * 2];
		 * 
		 * System.arraycopy(students, 0, newArr, 0, students.length);
		 * 
		 * students = newArr;
		 * 
		 * }
		 * 
		 * currentIndex++; students[currentIndex] = std; // 값이 들어있는 마지막 인덱스에 값을 넣어
		 */

	}

	// students 배열 요소 중 name 속성 값이 전달받은 name과 일치 배열 요소를 찾아
	// 해당 요소가 참조하는 Student 객체를 전달받은 std로 얕은 복사
	@Override
	public void updateStudent(String name, Student std) {
		for (int i = 0; i < students.length; i++) {
			if (students[i].getName().equals(name)) {
				students[i] = std; // 얕은복사
			}
		}
	}

	// 전달받은 name과 일치하는 이름을 가진 학생 정보를 students 배열에서 제거 후
	// 배열 중간이 비어있지 않도록 뒤쪽의 내용을 앞으로 당겨오기.
	// 이름이 일치하는 학생이 있을 경우 삭제한 학생 정보(Student), 없을 경우 null을 반환
	@Override
	public Student deleteStudent(String name) {
		Student std = null; // 삭제된 학생 정보를 저장하는 변수

		// 이름 검색
		for (int i = 0; i <= currentIndex; i++) {
			if (students[i].getName().equals(name)) {

				std = students[i];

				// 제거된 요소의 다음 요소를 헌재 인덱스에 대입하여 덮어쓰기
				for (int j = i; j < currentIndex; j++) {
					students[j] = students[j + 1];
				}

				// 마지막 데이터가 있던 요소를 null로 바꿔줌
				students[currentIndex--] = null;
				break;

			}
		}

		return std;
		/*
		 * Student newObject = null; for (int i = 0; i < students.length; i++) { if
		 * (students[i] != null) {
		 * 
		 * if (students[i].getName().equals(name)) { newObject = students[i]; for (int j
		 * = i; j < students.length - 1; j++) { students[j] = students[j + 1];
		 * students[currentIndex] = null; } }
		 * 
		 * } }
		 * 
		 * return newObject;
		 */

	}
}
