package com.kh.noticeBoard.model.service;

import java.util.List;

import com.kh.noticeBoard.model.vo.Board;

public interface BoardService {
	// 전체 게시글 리스트 조회
	public abstract List<Board> viewAll();
	
	// 게시글 생성
	public abstract void createBoard(Board board);
	
	// 입력한 제목을 가진 게시글 조회
	public abstract Board selectTitle(String title);
	
	// 입력한 작성자를 가진 게시글 조회
	public abstract List<Board> selectAuthor(String author);
	
	// 게시글 수정
	public abstract String updateBoard(String title, String pwd, Board board);
	
	// 게시글 삭제(비밀번호 입력해서 맞으면 삭제)
	public abstract Board deldteBoard(String title, String pwd);
}
