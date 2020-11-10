package com.kh.music.model.service;

import java.util.List;

import com.kh.music.model.vo.Music;

public interface MusicService {
	
	// 1. 음악 목록 전체 조회
	public abstract List<Music> selectAll();

	// 2-1. 특정 단어가 제목에 포함된 노래 조회
	public abstract List<Music> selectTitle(String title);
	
	// 2-2. 특정 단어가 가수명에 포함된 노래 조회
	public abstract List<Music> selectArtist(String artist);
	
	// 2-3. 좋아요 랭킹순으로 조회
	public abstract List<Music> selectTopFavoriteCount();

	// 3-1. 나의 뮤직 리스트 조회
	public abstract List<Music> selectMyMusicList();

	// 3-2. 나의 뮤직 리스트에 곡 추가(곡 번호)
	public abstract boolean addMusicList(int musicNo);

	// 3-3. 나의 뮤직 리스트에 곡 제거(곡 번호)
	public abstract Music removeMusicList(int musicNo);
	
	// 4. 좋아요 누르기
	public abstract void incFavoriteCount(int musicNo);
}
