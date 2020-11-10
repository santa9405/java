package com.kh.music.model.vo;

public class Music {
	private int musicNo;	// 곡 번호
	private String title;	// 곡 제목
	private String artist;	// 가수
	private int favoriteCount;	// 좋아요 수
	
	// 기본 생성자
	public Music() { }

	// 매개변수로 musicNo, title, artist 만 가지고 있는 생성자.
	public Music(int musicNo, String title, String artist) {
		super();
		this.musicNo = musicNo;
		this.title = title;
		this.artist = artist;
		// 해당 생성자로 객체 생성 시 favoriteCount가 지정되어 있지 않으므로 
		// favoriteCount는 JVM의 int형 기본값 0으로 초기화됨.
	}

	public Music(int musicNo, String title, String artist, int favoriteCount) {
		super();
		this.musicNo = musicNo;
		this.title = title;
		this.artist = artist;
		this.favoriteCount = favoriteCount;
	}

	public int getMusicNo() {
		return musicNo;
	}

	public void setMusicNo(int musicNo) {
		this.musicNo = musicNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getFavoriteCount() {
		return favoriteCount;
	}

	public void setFavoriteCount(int favoriteCount) {
		this.favoriteCount = favoriteCount;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artist == null) ? 0 : artist.hashCode());
		result = prime * result + favoriteCount;
		result = prime * result + musicNo;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Music [musicNo=" + musicNo + ", title=" + title + ", artist=" + artist + ", favoriteCount="
				+ favoriteCount + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		if (artist == null) {
			if (other.artist != null)
				return false;
		} else if (!artist.equals(other.artist))
			return false;
		if (favoriteCount != other.favoriteCount)
			return false;
		if (musicNo != other.musicNo)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
}
