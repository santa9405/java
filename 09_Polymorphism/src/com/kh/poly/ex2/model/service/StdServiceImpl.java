package com.kh.poly.ex2.model.service;

public class StdServiceImpl implements StudentService {

	private String[] stdArr = new String[3];
	private int currentIndex = 0;

	@Override
	public void addStudent(String name) {

		// currentIndex의 값이 현재 stdArr 배열의 길이와 같다면
		// == 배열이 꽉 찼다면 --> 2배 증가
		if (currentIndex == stdArr.length) {
			// 길이가 2배 더 긴 새로운 배열 생성, 할당
			String[] newArr = new String[stdArr.length * 2];

			// 깊은 복사
			System.arraycopy(stdArr, 0, newArr, 0, stdArr.length);

			// 얕은 복사
			stdArr = newArr;
		}
		stdArr[currentIndex] = name;
		currentIndex++;
	}

}
