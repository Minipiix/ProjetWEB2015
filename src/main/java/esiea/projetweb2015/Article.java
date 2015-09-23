package esiea.projetweb2015;

public class Article {
	
	private final long primaryKey;
	private final long gameId;
	private final String content;
	
	public Article(long primaryKey, long gameId, String content){
		this.primaryKey=primaryKey;
		this.gameId=gameId;
		this.content=content;
	}
	
	public long getPrimaryKey(){
		return primaryKey;
	}
	
	public long getGameId(){
		return gameId;
	}
	
	public String getContent(){
		return content;
	}

}
