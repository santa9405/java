package com.kh.io.view;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.io.model.service.ByteService;

public class IOView {

	private Scanner sc = new Scanner(System.in);
	private ByteService bService = new ByteService();

	public void displayMain() {
		int sel = 0;
		
		do {
			try {
				System.out.println("===== 입출력 메뉴 =====");
				System.out.println("1. BYTE 기반 파일 작성(출력)");
				System.out.println("2. BYTE 기반 파일 열기(입력)");
				System.out.println("3. 문자 기반 파일 작성(출력)");
				System.out.println("4. 문자 기반 파일 열기(입력)");
				System.out.println("5. 파일 복사(입력 + 출력)");
				System.out.println("0. 종료");
				System.out.print("메뉴 선택 >> ");
				
				sel = sc.nextInt();
				sc.nextLine(); // 이후 동작에서 문자를 입력받을 수 있기 때문에 미리 개행문자 제거
				
				switch(sel) {
				case 1 : byteFileSave(); break;
				case 2 : break;
				case 3 : break;
				case 4 : break;
				case 5 : break;
				case 0 : System.out.println("프로그램 종료");break;
				default : System.out.println("잘못 입력함.");
				}
				
				
			}catch(InputMismatchException e) {
				System.out.println("정수만 입력해주세요.");
				sel = -1; // sel이 0으로 유지돼서 종료되는걸 방지
				sc.nextLine(); // 입력 버퍼에 남아있는 잘못 입력한 문자열을 제거
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		}while(sel != 0);
}

	// 바이트 기반 입력
	private void byteFileSave() throws FileNotFoundException {
		System.out.println("---바이트 기반 파일 입력---");
		
		System.out.print("새로 생성할 파일명 : ");
		String fileName = sc.nextLine();
		
		// 입력되는 모든 내용을 합쳐서 저장
		StringBuffer content = new StringBuffer();
		
		// 입력되는 내용 한 줄을 임시 저장
		String input = null;
		
		System.out.println("-----파일 내용 입력(exit 입력 시 입력 종료)-----");
		
		while(true) {
			input = sc.nextLine();
			
			// 입력받은 문자열이 "exit"인 경우 반복문 종료
			if(input.equals("exit")) break;
			
			// StringBuffer에 입력받은 내용 + 개행문자를 추가
			content.append(input + "\n");
		}
		
		//System.out.println("--------------------------------------");
		//System.out.println(content.toString());
		
		// 입력받은 파일명과 내용을 ByteService에 있는 
		// byteFileSave() 메소드에 전달하여 결과를 반환 받기
		int result = bService.byteFileSave(fileName, content.toString());
		
		if(result == 1) {
			System.out.println(fileName + ".txt 파일 저장 성공");
		}else {
			System.out.println(fileName + ".txt 파일 저장 실패");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
