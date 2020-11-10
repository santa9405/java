package com.kh.music.model.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

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
		musicTable.add(new Music(seqMusicNo++, "Dynamite", "BTS"));
		musicTable.add(new Music(seqMusicNo++, "힘든 건 사랑이 아니다", "임창정"));
		musicTable.add(new Music(seqMusicNo++, "Lovesick Girls", "BLACKPINK"));
		musicTable.add(new Music(seqMusicNo++, "DON'T TOUCH ME", "환불원정대"));
		musicTable.add(new Music(seqMusicNo++, "취기를 빌려 (취향저격 그녀 X 산들)", "산들"));
		musicTable.add(new Music(seqMusicNo++, "오래된 노래", "스탠딩 에그"));
		musicTable.add(new Music(seqMusicNo++, "잠이 오질 않네요", "장범준"));
		musicTable.add(new Music(seqMusicNo++, "딩가딩가 (Dingga)", "마마무"));
		musicTable.add(new Music(seqMusicNo++, "When We Disco (Duet with 선미)", "박진영"));
		musicTable.add(new Music(seqMusicNo++, "I CAN’T STOP ME", "TWICE(트와이스)"));
	}

	// 1. 음악 목록 전체 조회
	@Override
	public List<Music> selectAll() {
		return musicTable;
	}

	// 2-1. 특정 단어가 제목에 포함된 노래 조회
	@Override
	public List<Music> selectTitle(String title) {
		/*
		 * for (Student temp : students) { if (temp.getName().equals(name)) { std =
		 * temp; break;
		 */

		List<Music> list = new ArrayList<>();

		for (Music musicList : musicTable) {
			if (musicList.getTitle().contains(title)) {
				list.add(musicList);
			}
		}

		return list;
	}

	// 2-2. 특정 단어가 가수명에 포함된 노래 조회
	@Override
	public List<Music> selectArtist(String artist) {

		List<Music> list = new ArrayList<>();

		for (Music musicList : musicTable) {
			if (musicList.getArtist().contains(artist)) {
				list.add(musicList);
			}
		}

		return list;
	}

	// 2-3. 좋아요 랭킹순으로 조회
	@Override
	public List<Music> selectTopFavoriteCount() {

		return null;
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
