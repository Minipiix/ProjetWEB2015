package esiea.projetweb2015.dao;

import java.util.Date;
import java.util.List;

import esiea.projetweb2015.model.Article;
import esiea.projetweb2015.model.GameId;

public interface ArticleDao{
	
	void saveArticle(Integer id, GameId gameId, String content, String title,
			String writter, Date date);

	List<Article> getAllArticles();
	
	List<Article> getArticlesByGame(Integer gameId);
	
	List<Article> getLastArticle();

}
