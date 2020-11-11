package com.kh.music.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.kh.music.model.vo.Music;

public class MusicServiceImpl implements MusicService {

	private Scanner sc = new Scanner(System.in);

	private List<Music> musicTable = null; // 음악 데이터가 저장되어 있는 리스트
	private List<Music> myList = new ArrayList<Music>(); // 나의 뮤직 리스트

	private int seqMusicNo = 1; // 음악이 추가될 때 마다 고유한 번호를 부여하는 변수. (DB 시퀀스처럼 사용, PK를 지정한다고 생각하자!)

	public MusicServiceImpl() {
		// 기본생성자로 MusicServiceImpl 객체가 생성된 경우
		// musicTable 객체 생성 후 샘플 데이터 10개 추가
		musicTable = new ArrayList<Music>();
		musicTable.add(new Music(seqMusicNo++, "Dynamite", "BTS", 100));
		musicTable.add(new Music(seqMusicNo++, "힘든 건 사랑이 아니다", "임창정", 150));
		musicTable.add(new Music(seqMusicNo++, "Lovesick Girls", "BLACKPINK", 60));
		musicTable.add(new Music(seqMusicNo++, "DON'T TOUCH ME", "환불원정대", 10));
		musicTable.add(new Music(seqMusicNo++, "취기를 빌려 (취향저격 그녀 X 산들)", "산들", 50));
		musicTable.add(new Music(seqMusicNo++, "오래된 노래", "스탠딩 에그", 80));
		musicTable.add(new Music(seqMusicNo++, "잠이 오질 않네요", "장범준", 120));
		musicTable.add(new Music(seqMusicNo++, "딩가딩가 (Dingga)", "마마무", 200));
		musicTable.add(new Music(seqMusicNo++, "When We Disco (Duet with 선미)", "박진영", 5));
		musicTable.add(new Music(seqMusicNo++, "I CAN’T STOP ME", "TWICE(트와이스)", 80));
	}

	// 1. 음악 목록 전체 조회
	@Override
	public List<Music> selectAll() {
// 접근제한자       반환형	           메소드명
		return musicTable;
	}

	// 2-1. 특정 단어가 제목에 포함된 노래 조회
	@Override
	public List<Music> selectTitle(String title) {

		// 검색된 음악 정보들을 모두 저장할 새로운 List를 선언 및 생성
		List<Music> searchList = new ArrayList<>(); // 읽기만 하는 경우 ArrayList가 효율이 제일 좋음

		// musicTable에 있는 노래들 중
		// 전달 받아온 title이 제목으로 포함되어 있는 노래들을 검색
		for (Music musicList : musicTable) {
			if (musicList.getTitle().contains(title)) {
				// if ("Dynamite".contains("a")) {
				// musicTable에서 순차적으로 하나씩 꺼내온 music 객체의 제목에
				// title이라는 단어가 포함되어 있을 경우
				searchList.add(musicList);
			}
		}

		return searchList;
	}

	// 2-2. 특정 단어가 가수명에 포함된 노래 조회
	@Override
	public List<Music> selectArtist(String artist) {

		List<Music> searchList = new ArrayList<>();
		// -> 타입 추론(참조변수에 작성된 제네릭을 보고
		// <> 내부에 작성될 타입을 추론하여 컴파일 단계에서 자동 추가)

		for (Music music : musicTable) {

			// 현재 접근한 music 객체의 가수명을 얻어와 소문자로 변환 후
			// 매개변수로 얻어온 artist의 소문자 변환 값이 포함 되어있는 경우
			if (music.getArtist().toLowerCase().contains(artist.toLowerCase())) {
				// BTS -> "bts".contains("bt")
				searchList.add(music);
			}
		}
		
		return searchList;
	}

	// 2-3. 좋아요 랭킹순으로 조회
	@Override
	public List<Music> selectTopFavoriteCount() {

		// musicTable List를 깊은 복사하여 list 변수로 참조
		// 왜? 원본인 musicTable의 순서를 유지하기 위해서
		List<Music> list = new ArrayList<>(musicTable);

		// 삽입 정렬 내림차순
		for (int i = 1; i < list.size(); i++) {
			for (int j = i - 1; j >= 0; j--) {

				// if (arr[j + 1] < arr[j]) {
				if (list.get(j + 1).getFavoriteCount() // 다음 요소의 좋아요 수가 현재 요소의 좋아요 수보다 작다면
						> list.get(j).getFavoriteCount()) {
					Music temp = list.get(j + 1);
					// arr[j+1] = arr[j];
					list.set(j + 1, list.get(j));

					// arr[j] = temp;
					list.set(j, temp);
				}
			}
		}
		
		Collections.sort(list);

		return list;
	}

	// 3-1. 나의 뮤직 리스트 조회
	@Override
	public List<Music> selectMyMusicList() {

		return myList;
	}

	// 3-2. 나의 뮤직 리스트에 곡 추가(곡 번호)
	@Override
	public boolean addMusicList(int musicNo) {

		for (Music list : musicTable) {
			if (list.getMusicNo() == musicNo) {
				return myList.add(list);
			}

		}

		return false;
	}

	// 3-3. 나의 뮤직 리스트에 곡 제거(곡 번호)
	@Override
	public Music removeMusicList(int musicNo) {

		List<Music> music = new ArrayList<>(musicNo);

		Music result = null; // 삭제 되는 뮤직 넘버를 저장할 변수 선언

		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i).getMusicNo() == musicNo) {
				return result = myList.remove(i);
			}
		}

		return null;
	}

	// 4. 좋아요 누르기
	@Override
	public void incFavoriteCount(int musicNo) {

	}

}
