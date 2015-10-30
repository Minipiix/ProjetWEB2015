package esiea.projetweb2015.model;

public enum GameId {
	DIABLO(0),
	WOW(1),
	HOTS(2),
	HS(3),
	SC(4);
	
	private int gameId;
	
	GameId(int gameId){
		this.gameId=gameId;
	}
	
	public int getGameId(){
		return gameId;
	}
	
	public static GameId getFromInt(int intId) {
		for (GameId gameId : values()) {
			if(gameId.getGameId() == intId) {
				return gameId;
			}
		}
		return null;
	}

}
