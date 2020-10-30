package com.kh.noticeBoard.view;

import java.util.List;

import com.kh.noticeBoard.model.service.BoardService;
import com.kh.noticeBoard.model.service.BoardServiceImpl;
import com.kh.noticeBoard.model.vo.Board;

public class BoardViewImpl extends BoardView {

	private BoardService service = new BoardServiceImpl();

	@Override
	public void viewAll() {
		// service.viewAll() 메소드를 호출하여 게시글 리스트를 반환받아
		// 작성된 전체 게시글을 조회하는 기능
		// 게시글은 제목과 작성자, 조회수만 표시되어야 한다.

		List<Board> board = service.viewAll();
		for (Board boardList : board) {
			System.out.println(boardList);
		}
	}

	@Override
	public void selectTitle() {
		// service.selectTitle() 메소드를 호출하여
		// 전달받은 매개변수를 통해 제목으로 검색하여 게시글을 조회하는 기능
		// 제목을 검색해서 게시글을 조회할 경우 해당 게시글의 조회수를 1 증가시킨다.

		System.out.println("게시글 제목 입력 : ");
		String title = sc.nextLine();

		Board board = service.selectTitle(title);

		if (board != null) {
			System.out.println(board);
		} else {
			System.out.println("검색한 게시글이 존재하지 않습니다.");
		}

	}

	@Override
	public void selectAuthor() {
		// 전달받은 매개변수를 통해 작성자로 검색하여 게시글을 조회하는 기능
		// service.selectAuthor() 메소드를 호출하여 리스트를 반환받아
		// 향상된 for문을 이용하여 출력한다.
		// 작성자의 이름으로 검색해서 게시글을 조회할 경우 조회수는 오르지 않는다.

		System.out.println("게시글 작성자 입력 : ");
		String author = sc.nextLine();

		List<Board> board = service.selectAuthor(author);

		for (Board boardList : board) {
			System.out.println(boardList);
		}

	}

	@Override
	public void createBoard() {
		// 게시글을 새로 작성하는 기능
		// 제목, 작성자, 게시글 내용과
		// 게시글의 비밀번호를 입력받은뒤 Board 객체를 생성하고
		// service.create() 메소드를 호출하여 Board 객체를 매개변수로 전달하여
		// 새로운 게시글을 추가한다.

		System.out.println("제목 입력 : ");
		String title = sc.nextLine();
		System.out.println("작성자 입력 : ");
		String author = sc.nextLine();
		System.out.println("내용 입력 : ");
		String content = sc.nextLine();

		Board board = new Board(title, author, content);

		service.createBoard(board);
	}

	@Override
	public void updateBoard() {
		// 존재하는 게시글을 수정하는 기능
		// 입력받은 제목과 일치하는 게시글이 없을경우
		// "입력하신 제목과 일치하는 게시글이 존재하지 않습니다."를 출력
		// 제목과 작성자, 내용, 비밀번호를 입력받은 뒤
		// 비밀번호는 매개변수로 같이 전달해서 비밀번호를 검사하고
		// service.updateBoard() 메소드를 호출하여
		// 제목과 비밀번호가 동일하면 수정 null 값이 리턴되면
		// "입력하신 비밀번호가 올바르지 않습니다." 출력
		System.out.println("수정할 게시글 제목 입력 : ");
		String title = sc.nextLine();

		Board board = service.selectTitle(title);

		if (board == null) {
			System.out.println("입력하신 제목과 일치하는 게시글이 존재하지 않습니다.");
		} else {
			System.out.println("제목 : ");
			String updateTitle = sc.nextLine();
			System.out.println("작성자 : ");
			String updateAuthor = sc.nextLine();
			System.out.println("내용 : ");
			String content = sc.nextLine();
			System.out.println("비밀번호 : ");
			String pwd = sc.nextLine();
			
			Board abc = new Board(updateTitle, updateAuthor, content);

			String str = service.updateBoard(title, pwd, abc);
			
			if(str != null) {
			System.out.println(str);
			}else {
				System.out.println("입력하신 비밀번호가 올바르지 않습니다.");
			}
			
		}

	}

	@Override
	public void deleteBoard() {
		// 존재하는 게시글을 삭제하는 기능
		// 삭제할 게시글의 제목과 비밀번호를 입력받고
		// 임시 Board 객체를 만든 뒤 service.deleteBoard() 메소드를 호출하여
		// 제목과 비밀번호를 검사 한 뒤
		// 검사를 통과하면 삭제된 게시글 제목 + " 게시글을 삭제하였습니다." 출력
		// 검사를 통과하지 못하고 null 값을 리턴 받으면 "제목 또는 비밀번호를 확인해 주세요." 출력

	}
}
