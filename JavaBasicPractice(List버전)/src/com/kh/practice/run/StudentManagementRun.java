package com.kh.practice.run;

import com.kh.practice.view.StudentManagementView;
import com.kh.practice.view.StudentManagementViewImpl;

public class StudentManagementRun {
	public static void main(String[] args) {
		StudentManagementView view = new StudentManagementViewImpl();
		view.displayMainMenu();
	}
}
