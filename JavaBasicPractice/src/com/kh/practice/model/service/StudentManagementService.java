package com.kh.practice.model.service;

import com.kh.practice.model.vo.Student;

public interface StudentManagementService {

	// 전체 학생 정보가 담겨있는 배열을 반환하는 service
	public abstract Student[] selectAll();
	
	// students 객체 배열에서 이름이 일치하는 학생 객체 반환하는 service
	// 일치하는 학생이 없으면 null 반환 (동명이인은 없다고 가정)
	public abstract Student selectName(String name);
	
	// students 객체 배열에서 전달받은 gender와 성별이 일치하는 학생을 Student 배열로 반환하는 service
	public abstract Student[] selectGender(char gender);
	
	// students 객체 배열에서 전달받은 age와 나이가 일치하는 학생을 Student 배열로 반환하는 service
	// 일치하는 학생이 없으면 null 반환
	public abstract Student[] selectAge(int age);
	
	// 전달받은 Student 객체를 Student[] 배열인 students에 추가
	// 만약 students 배열의 크기가 부족할 경우 2배로 증가시킨 후 추가.
	public abstract void insertStudent(Student std);
	
	// students 배열 요소 중 name 속성 값이 전달받은 name과 일치 배열 요소를 찾아
	// 해당 요소가 참조하는 Student 객체를 전달받은 std로 얕은 복사
	public abstract void updateStudent(String name, Student std);
	
	// 전달받은 name과 일치하는 이름을 가진 학생 정보를 students 배열에서 제거 후
	// 배열 중간이 비어있지 않도록 뒤쪽의 내용을 앞으로 당겨오기.
	// 이름이 일치하는 학생이 있을 경우 삭제한 학생 정보(Student), 없을 경우 null을 반
	public abstract Student deleteStudent(String name);
}
