package com.kh.io.model.dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {
	// DAO(Data Access Object)
	// - 데이터 저장소에 접속하여
	// 실제 데이터를 전송하거나 결과 값을 전달받는 역할을 하는 객체

	// 바이트 기반 스트림 : 1byte 단위로 데이터를 입력 또는 출력하는 스트림
	public int byteFileSave(String fileName, String content, String path) throws FileNotFoundException {

		int result = 0;

		// 프로그램 -> 파일로 출력
		// FileOutputStream 사용(통로 역할)

		FileOutputStream fOut
			= new FileOutputStream(path + "/" + fileName + ".txt" /* , true */);
				// byte 폴더 안에 입력받은 파일명.txt 파일을 출력할 스트림 객체 생성(파일 경로)

		// ** FileOutputStream 객체 생성 성공 시
		// 매개변수로 작성된 파일이 없다면 -> 바로 생성
		// 있다면 -> 덮어쓰기 또는 이어쓰기
		// --> 매개변수에 true 작성 시 이어쓰기,
		// false 또는 생략 시 덮어쓰기

		try {
			for (int i = 0; i < content.length(); i++) {
				// content에 작성된 문자의 개수만큼 반복하며
				// 한 글자씩 스트림을 통해 파일로 출력

				fOut.write(content.charAt(i));

			}
			
			result = 1; // 1 반환 == 출력 성공

		} catch (IOException e) {
			e.printStackTrace();
		}finally { // 예외 발생 여부와 상관 없이 무조건 실행
			
			// 스트림은 사용한 경우 반드시 반환해야 함!!!
			try {
				if(fOut != null) 	fOut.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
