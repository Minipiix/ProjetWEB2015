package esiea.projetweb2015.model;

public class Article {
	
	private final String content;
	private final String title;
	private final String writter;
	private final String date;
	
	
	public Article(String content, String title, String writter, String date){
		this.content=content;
		this.title=title;
		this.writter=writter;
		this.date=date;
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
	
	public String getDate(){
		return date;
	}

	@Override
	public String toString() {
		return "Article [content="
				+ content + ", title=" + title + ", writter=" + writter
				+ ", date=" + date + "]";
	}
	
	

}
