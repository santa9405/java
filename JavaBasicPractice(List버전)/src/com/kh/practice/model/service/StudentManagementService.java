package com.kh.practice.model.service;

import java.util.List;

import com.kh.practice.model.vo.Student;

public interface StudentManagementService {

	// 전체 학생 정보가 담겨있는 List를 반환하는 service
	public abstract List<Student> selectAll();
	
	// students List에서 이름이 일치하는 학생 객체 반환하는 service
	// 일치하는 학생이 없으면 null 반환 (동명이인은 없다고 가정)
	public abstract Student selectName(String name);
	
	// students List에서 전달받은 gender와 성별이 일치하는 학생을 List로 반환하는 service
	public abstract List<Student> selectGender(char gender);
	
	// studentsList에서 전달받은 age와 나이가 일치하는 학생을 List로 반환하는 service
	// 일치하는 학생이 없으면 null 반환
	public abstract List<Student> selectAge(int age);
	
	// 전달받은 Student 객체를 List인 students에 추가
	public abstract void insertStudent(Student std);
	
	// List 요소 중 name 속성 값이 전달받은 name과 일치하는 요소를 찾아 수정
	public abstract void updateStudent(String name, Student std);
	
	// 전달받은 name과 일치하는 이름을 가진 학생 정보를 List에서 제거 후 제거한 학생 정보를 반환
	public abstract Student deleteStudent(String name);
}
