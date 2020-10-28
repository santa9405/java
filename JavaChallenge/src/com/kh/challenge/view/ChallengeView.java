package com.kh.challenge.view;

import java.util.Scanner;

import com.kh.challenge.model.service.ChallengeService;
import com.kh.challenge.model.service.ChallengeServiceImpl;

public class ChallengeView {
	
	private Scanner sc = new Scanner(System.in);
	ChallengeService service = new ChallengeServiceImpl();
	
	public void displayMain() {
		System.out.print("실행할 챌린지 번호 입력 : ");
		int sel = sc.nextInt();
		sc.nextLine();
		
		switch (sel) {
		case 1: service.challenge1(); break;
		case 2: service.challenge2(); break;
		case 3: service.challenge3(); break;
		case 4: service.challenge4(); break;
		case 5: service.challenge5(); break;
		case 6: service.challenge6(); break;
		case 7: service.challenge7(); break;
		case 8: service.challenge8(); break;
		case 9: service.challenge9(); break;
		case 10: service.challenge10(); break;
		case 11: service.challenge11(); break;
		case 12: service.challenge12(); break;
		case 13: service.challenge13(); break;
		case 14: service.challenge14(); break;
		case 15: service.challenge15(); break;
		case 16: service.challenge16(); break;
		case 17: service.challenge17(); break;
		case 18: service.challenge18(); break;
		case 19: service.challenge19(); break;
		case 20: service.challenge20(); break;
		case 21: service.challenge21(); break;
		}
	
	}

}
