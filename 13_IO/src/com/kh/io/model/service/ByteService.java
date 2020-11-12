package com.kh.io.model.service;

import java.io.File;
import java.io.FileNotFoundException;

import com.kh.io.model.dao.ByteDAO;

public class ByteService {
	
	private ByteDAO byteDAO = new ByteDAO();

	public int byteFileSave(String fileName, String content) throws FileNotFoundException {

		File folder = new File("byte");

		if (!folder.exists()) { // byte ������ �������� �ʴ� ���
			folder.mkdir(); // byte ���� ����
		}

		int result = byteDAO.byteFileSave(fileName, content, "byte");
		
		return result; // byteDAO.byteFileSave �� ���� ����� �״�� View�� ��ȯ
	}

}