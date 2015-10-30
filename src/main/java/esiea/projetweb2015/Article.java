package esiea.projetweb2015;

import java.util.Date;

public class Article {
	
	private final long id;
	private final long gameId;
	private final String content;
	private final String title;
	private final String writter;
	private final Date date;
	
	public Article(long id, long gameId, String content, String title, String writter, Date date){
		this.id=id;
		this.gameId=gameId;
		this.content=content;
		this.title=title;
		this.writter=writter;
		this.date=date;
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

}
