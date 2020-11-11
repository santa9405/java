package com.kh.music.model.vo;

public class Music implements Comparable<Music> {
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
		return musicNo + " / " + title + " / " + artist + " / "
				+ favoriteCount;
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

	@Override
	public int compareTo(Music o) {
		// Music 객체들 간의 기본 비교 기준을 작성
		
		// 반환되는 값은 양수, 0, 음수가 나올 수 있는 형태로 로직 처리
		return o.favoriteCount - favoriteCount;
		
		// -> 자바에서 제공하는 각종 정렬메소드(기본값 오름차순)가 있음
		//	    이 때 정렬 메소드가 comparTo()의 반환값을 이용하여 정렬을 진행함
		//	    양수가 반환되면 두 데이터간의 교환(swap)이 발생함
	}
	
	
}
