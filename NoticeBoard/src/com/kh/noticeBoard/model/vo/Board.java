package com.kh.noticeBoard.model.vo;

public class Board {
	private String title;
	private String author;
	private String content;
	private String pwd;
	private int count; // 게시글의 조회수

	public Board() {}
	
	public Board(String title, String author, String content, String pwd) {
		super();
		this.title = title;
		this.author = author;
		this.content = content;
		this.pwd = pwd;
		this.count = 0;
	}
	
	public Board(String title, String author, String content) {
		super();
		this.title = title;
		this.author = author;
		this.content = content;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getContent() {
		return content;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "제목 : " + title + " || 작성자 : " + author + " || 게시글 : " + content + " || 조회수 : "
				+ count;
	}
}
