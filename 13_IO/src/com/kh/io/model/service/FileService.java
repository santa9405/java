package com.kh.io.model.service;

import java.io.File;
import java.io.IOException;

public class FileService {

	// File 클래스
	// - 파일 시스템의 파일을 표현하는 클래스

	// File 클래스 주의 사항
	// - File 클래스로 객체를 생성한다고 해서 진짜 파일이 만들어지는건 아님!

	public void example1() {
		try {
			// 1. 파일 생성
			File f1 = new File("test1234.txt"); // 상대 경로
			// -> 파일 이름만 적혀있는 경우
			// 현재 프로젝트 최상단을 의미함.

			// test123.txt 파일이 있다면?
			// -> f1 변수를 통해서 실제 test123.txt 파일에 접근할 수 있게됨

			// test123.txt 파일이 없다면?
			// 현재 프로젝트 최상단에 test123.txt 파일을 만들어 낼 준비를 할 수 있게됨
			f1.createNewFile();
			// -> createNewFile() == 새로운 파일을 만드는 것
			// --> 자바 프로그램 -> 실제 컴퓨터 저장소로 파일을 출력
			// --> 입력 또는 출력과 관련된 메소드는 IOException을 발생시킬 가능성이 있음
			// --> IOException은 예외처리를 반드시 해줘야하는 CheckedException
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void example2() {
		// 2. 원하는 위치에 파일 생성
		// 절대 경로를 이용하여 C드라이브에 있는 dev폴더에 파일 생성하기
		// 절대 경로 : 최상위 드라이브 또는 폴더로 부터의 경로를 모두 작성
		try {
			File f2 = new File("C:\\dev/test.txt");

			if (f2.createNewFile()) {
				System.out.println("파일 생성 성공");
			} else {
				System.out.println("파일 생성 실패");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void example3() {
		// 2. 원하는 위치에 파일 생성
		// 현재 프로젝트의 src 폴더 밑에 test.txt 파일 생성하기
		// 상대 경로 : 현재 파일의 위치를 기준으로 하여 경로를 작성
		// -> 자바 프로젝트에서 상대 경로 : 현재 프로젝트를 기준으로 하여 경로 작성

		try {
			// \, // 둘 다 하위폴더를 의미함!
			// ../ 은 상위폴더를 의미함!
			// File f2 = new File("C:\\workspace\\1_Java\\13_IO\\src\\test.txt"); // 절대 경로
			// File f2 = new File("src/test2.txt"); // 상대 경로
			File f2 = new File("../test.txt");

			if (f2.createNewFile()) {
				System.out.println("파일 생성 성공");
			} else {
				System.out.println("파일 생성 실패");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void example4() {
		// 존재하지 않는 폴더에 파일 생성하기

		// 현재 프로젝트 제일 상단에 temp 폴더를 만들어서
		// 그 안에 test.txt 파일 만들기

		try {

			// 1. temp 폴더가 있는지 확인
			File folder = new File("temp");

			// exists() : 해당 경로에 폴더나 파일이 존재하면 true
			if (!folder.exists()) { // temp 폴더가 존재하지 않는 경우

				// temp 폴더 생성
				if (folder.mkdir()) { // 폴더 생성
					System.out.println(folder.getName() + " 폴더가 생성되었습니다.");
				}
			}

			File f = new File("temp/test.txt");
			if(f.createNewFile()) {
				System.out.println(f.getName() + " 파일이 생성되었습니다.");
			}
			
			System.out.println("파일명 : " + f.getName());
			System.out.println("저장 경로(절대 경로) : " + f.getAbsolutePath());
			System.out.println("저장 경로(상대 경로) : " + f.getPath());
			System.out.println("상위 폴더 : " + f.getParent());
			System.out.println("파일 용량 : " + f.length());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
