package esiea.projetweb2015.model;

import java.util.Date;

public class Article {
	
	private Integer id;
	private Integer gameId;
	private String content;
	private String title;
	private String writter;
	private Date date;
	
	public Article() {
		// nothing to do
	}
	
	public Article(Integer gameId, String content, String title, String writter, Date date){
		this.gameId=gameId;
		this.content=content;
		this.title=title;
		this.writter=writter;
		this.date=date;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public void setGameId(Integer gameId) {
		this.gameId = gameId;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setWritter(String writter) {
		this.writter = writter;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public long getId(){
		return id;
	}

	public long getGameId(){
		return gameId;
	}
	
	public String getContent(){
		return content;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getWritter(){
		return writter;
	}
	
	public Date getDate(){
		return date;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", gameId=" + gameId + ", content="
				+ content + ", title=" + title + ", writter=" + writter
				+ ", date=" + date + "]";
	}
	
	

}
