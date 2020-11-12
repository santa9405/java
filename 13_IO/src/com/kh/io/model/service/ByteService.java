package com.kh.io.model.service;

import java.io.File;
import java.io.FileNotFoundException;

import com.kh.io.model.dao.ByteDAO;

public class ByteService {
	
	private ByteDAO byteDAO = new ByteDAO();

	public int byteFileSave(String fileName, String content) throws FileNotFoundException {

		File folder = new File("byte");

		if (!folder.exists()) { // byte 폴더가 존재하지 않는 경우
			folder.mkdir(); // byte 폴더 생성
		}

		int result = byteDAO.byteFileSave(fileName, content, "byte");
		
		return result; // byteDAO.byteFileSave 의 수행 결과를 그대로 View로 반환
	}

}
