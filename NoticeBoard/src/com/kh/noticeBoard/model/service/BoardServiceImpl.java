package com.kh.noticeBoard.model.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.kh.noticeBoard.model.vo.Board;

public class BoardServiceImpl implements BoardService {

	private Board[] boards = { new Board("재탕 문제입니다.", "유현재", "내용은 아무거나", "1234"),
			new Board("보면서 푸심씨오.", "이한솔", "내용은 아무거나", "5678"), new Board("재탕 문제입니다.", "강수정", "내용은 아무거나", "9123"),
			new Board("매운탕 문제입니다.", "유현재", "내용은 아무거나", "1234") };

	// 객체 배열 리스트로 변환
	private List<Board> boardList = new ArrayList<Board>(Arrays.asList(boards));

	// 전체 게시물 조회를 위하여 게시글 리스트를 반환하는 메소드
	@Override
	public List<Board> viewAll() {
		return boardList;
	}

	// 제목으로 검색하기 위한 메소드
	// 향상된 for문을 이용하여 리스트에 접근하고
	// 제목이 같은지를 검사하여 같은 제목의 게시글을 반환해준다.
	// 게시글이 반환 될 경우 해당 게시글의 조회수를 1 올려준다.
	@Override
	public Board selectTitle(String title) {

		for (Board boardList : boardList) {
			int count = boardList.getCount();
			if (boardList.getTitle().equals(title)) {
				boardList.setCount(++count);
				return boardList;
			}
		}

		return null;
	}

	// 작성자의 이름으로 게시글을 검색하기 위한 메소드
	// 임시 리스트를 하나 생성하고
	// 매개변수로 받은 작성자 이름과 현재 존재하는 게시글 리스트의 작성자 이름을 비교하여
	// 같은 작성자가 있으면 임시 리스트에 해당 객체를 추가
	// 비교 작업이 끝나면 임시 리스트를 반환한다.
	@Override
	public List<Board> selectAuthor(String author) {

		List<Board> boardList = new ArrayList<Board>();

		for (int i = 0; i < boards.length; i++) {
			if (boardList.get(i).getAuthor().equals(author)) {
				boardList.add(boardList.get(i));
				return boardList;

			}

		}
		return null;
	}

	// 게시글을 추가하기 위한 메소드
	// 현재 게시글 리스트에 매개변수로 받은 board 객체를 추가한다.
	@Override
	public void createBoard(Board board) {
		boardList.add(board);
	}

	// 게시글을 수정하기 위한 메소드
	// 매개변수로 받은 제목과 비밀번호를 검사하여
	// 검사를 통과한 객체의 제목과 내용, 작성자를
	// 매개변수로 받은 board 객체의 제목과 내용, 작성자로 바꿔준다.
	// 비밀번호는 변경되거나 null 값이 되면 안된다.
	// 완료되면 "수정이 완료되었습니다" 라는 문자열 값을 반환하고
	// 조건을 통과한 객체가 없을 경우 null 값을 리턴
	@Override
	public String updateBoard(String title, String pwd, Board board) {

		String str = "";

		for (Board boards : boardList) {
			if (boards.getTitle().equals(title) && boards.getPwd().equals(pwd)) {
				str = "수정이 완료되었습니다.";
				boards = board;
			} else {
				str = null;
			}
		}

		return str;
	}

	// 게시글을 삭제하기 위한 메소드
	// for문을 이용하여 전달받은 제목과 비밀번호를
	// 현재 게시글 리스트와 비교하여 검사를 통과한 객체를 임시 저장한 뒤 지우고
	// 임시저장한 객체를 반환해준다. 조건을 통과한 객체가 없다면 null값을 반환.

	@Override
	public Board deldteBoard(String title, String pwd) {

		return null;
	}

}
