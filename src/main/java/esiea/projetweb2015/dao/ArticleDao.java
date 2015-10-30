package esiea.projetweb2015.dao;

import java.util.List;

import esiea.projetweb2015.model.Article;

public interface ArticleDao{

	void saveArticle(Article article);

	List<Article> getAllArticles();
	
	List<Article> getArticlesByGame(Integer gameId);
}
