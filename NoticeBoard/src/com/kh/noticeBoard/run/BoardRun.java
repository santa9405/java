package com.kh.noticeBoard.run;

import com.kh.noticeBoard.view.BoardView;
import com.kh.noticeBoard.view.BoardViewImpl;

public class BoardRun {
	public static void main(String[] args) {
		BoardView view = new BoardViewImpl();
		view.displayMainMenu();
	}
		
}
