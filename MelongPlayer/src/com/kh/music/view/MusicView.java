package com.kh.music.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.music.model.service.MusicService;
import com.kh.music.model.service.MusicServiceImpl;
import com.kh.music.model.vo.Music;

public class MusicView {

	private Scanner sc = new Scanner(System.in);
	MusicService service = new MusicServiceImpl();

	public void displayMain() {
		int sel = 0;
		do {
			System.out.println();
			System.out.println("--- Melong Player ---");
			System.out.println("1. 음악 목록 전체 조회");
			System.out.println("2. 조건에 맞는 목록 조회");
			System.out.println("3. 나의 뮤직 리스트 메뉴");
			System.out.println("4. 좋아요 누르기");
			System.out.println("0. 프로그램 종료");
			System.out.println("메뉴 선택 >> ");
			sel = sc.nextInt();
			sc.nextLine();

			switch (sel) {
			case 1:
				selectAll();
				break;
			case 2:
				selectConditionMenu();
				break;
			case 3:
				myMusicListMenu();
				break;
			case 4:
				incFavoriteCount();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break;

			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;

			}
		} while (sel != 0);

	}

	// 1. 음악 목록 전체 조회
	public void selectAll() {
		// service.selectAll()를 호출하여 반환 받은 List를
		// printList(list) 메소드의 매개변수로 전달하여 출력
		printList(service.selectAll());

	}

	// 전달받은 List 타입 객체에 저장된 모든 Music 정보를 출력하는 메소드
	public void printList(List<Music> list) {
		System.out.println();
		System.out.println("곡 번호  /  곡 제목  /  가수   / 좋아요 수");
		System.out.println("--------------------------------");

		// 출력하는 for문 작성!
		for (Music musicList : list) {
			System.out.println(musicList);
		}
	}

	// 2. 조건에 맞는 목록 조회
	public void selectConditionMenu() {
		int sel = 0;
		do {
			System.out.println();
			System.out.println("--- 조건 검색 ---");
			System.out.println("1. 특정 단어가 제목에 포함된 노래 조회");
			System.out.println("2. 특정 단어가 가수명에 포함된 노래 조회");
			System.out.println("3. 좋아요 랭킹순으로 조회");
			System.out.println("0. 메인 메뉴로 돌아가기");
			System.out.println("메뉴 선택 >> ");
			sel = sc.nextInt();
			sc.nextLine();

			switch (sel) {
			case 1:
				selectTitle();
				break;
			case 2:
				selectArtist();
				break;
			case 3:
				selectTopFavoriteCount();
				break;
			case 0:
				System.out.println("메인 메뉴로...");
				break;

			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;

			}
		} while (sel != 0);
	}

	// 2-1. 특정 단어가 제목에 포함된 노래 조회
	public void selectTitle() {
		System.out.println("-- 제목 검색 --");
		System.out.print("검색 값 입력 : ");
		String title = sc.nextLine();

		// 노래 제목을 입력받아 service.selectTitle() 메소드의 매개변수로 전달하고,
		// 반환 받은 List를 printList(list) 메소드의 매개변수로 전달하여 출력
		List<Music> music = service.selectTitle(title);

		System.out.print("검색 결과 : ");

		printList(music);

	}

	// 2-2. 특정 단어가 가수명에 포함된 노래 조회
	public void selectArtist() {
		System.out.println("-- 가수명 검색 --");
		System.out.print("검색 값 입력 : ");
		String artist = sc.nextLine();

		// 가수명을 입력받아 service.selectArtist() 메소드의 매개변수로 전달하고,
		// 반환 받은 List를 printList(list) 메소드의 매개변수로 전달하여 출력
		List<Music> music = service.selectArtist(artist);

		System.out.print("검색 결과 : ");

		printList(music);

	}

	// 2-3. 좋아요 랭킹순으로 조회
	public void selectTopFavoriteCount() {

		// service.selectTopFavoriteCount()를 호출하여 반환 받은 List를
		// printList(list) 메소드의 매개변수로 전달하여 출력
	}

	// 3. 나의 뮤직 리스트 메뉴
	public void myMusicListMenu() {
		int sel = 0;
		do {
			System.out.println();
			System.out.println("--- 나의 뮤직 리스트 ---");
			System.out.println("1. 나의 뮤직 리스트 조회");
			System.out.println("2. 뮤직 리스트에 곡 추가(곡 번호)");
			System.out.println("3. 뮤직 리스트에서 제거(곡 번호)");
			System.out.println("0. 메인 메뉴로 돌아가기");
			System.out.println("메뉴 선택 >> ");
			sel = sc.nextInt();
			sc.nextLine();

			switch (sel) {
			case 1:
				selectMyMusicList();
				break;
			case 2:
				addMusicList();
				break;
			case 3:
				removeMusicList();
				break;
			case 0:
				System.out.println("메인 메뉴로...");
				break;

			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;

			}
		} while (sel != 0);
	}

	// 3-1. 나의 뮤직 리스트 조회
	public void selectMyMusicList() {
		List<Music> myList = new ArrayList<Music>();

		printList(myList);
		// service.selectMyMusicList()를 호출하여 반환 받은 List를
		// printList(list) 메소드의 매개변수로 전달하여 출력
	}

	// 3-2. 나의 뮤직 리스트에 곡 추가(곡 번호)
	public void addMusicList() {
		System.out.println();
		System.out.println("-- 뮤직 리스트에 곡 추가 --");
		System.out.print("곡 번호 입력 : ");
		int musicNo = sc.nextInt();
		sc.nextLine(); // 버퍼에 남아있는 개행 문자 제거

		// 곡 번호를 입력받아 service.addMusicList() 메소드의 매개변수로 전달하고,
		service.addMusicList(musicNo);

		// boolean 값을 반환 받아 true면 "추가 성공!"
		if (service.addMusicList(musicNo) == true) {
			System.out.print("추가 성공!");
		} else {
			System.out.print("추가 실패 ....(번호를 잘못 입력하였거나, 이미 목록에 추가된 곡입니다.)");
		}
		// false면 "추가 실패 ....(번호를 잘못 입력하였거나, 이미 목록에 추가된 곡입니다.)" 출력
	}

	// 3-3. 나의 뮤직 리스트에 곡 제거(곡 번호)
	private void removeMusicList() {
		System.out.println();
		System.out.println("-- 뮤직 리스트에서 곡 삭제 --");
		System.out.print("곡 번호 입력 : ");
		int musicNo = sc.nextInt();
		sc.nextLine();
		// 곡 번호를 입력받아 service.removeMusicList() 메소드의 매개변수로 전달하고,
		service.removeMusicList(musicNo);
		
		// Music 객체 참조 주소 값을 반환 받아
		// null이 아니면 (삭제된 곡 정보) + " 이 제거되었습니다."
		Music mi = service.removeMusicList(musicNo);
		if (mi != null) {
			System.out.print(mi + "제거되었습니다.");
		}else {
			System.out.print("제거 실패 ....(번호를 확인해주세요.)");
		}
		// null이면 "제거 실패 ....(번호를 확인해주세요.)" 출력
	}

	// 4. 좋아요 누르기
	public void incFavoriteCount() {
		System.out.println();
		System.out.println("-- 좋아요 증가 --");
		System.out.print("곡 번호 입력 : ");
		int musicNo = sc.nextInt();
		sc.nextLine();

		// 곡 번호를 입력받아 service.incFavoriteCount() 메소드의 매개변수로 전달해 좋아요 수 증가.
		service.incFavoriteCount(musicNo);
		// (반환값 없음)
	}

}
