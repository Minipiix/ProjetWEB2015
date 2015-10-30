package esiea.projetweb2015.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import esiea.projetweb2015.dao.ArticleDao;
import esiea.projetweb2015.model.Article;

@RestController
@RequestMapping("/article")
public class ArticleController {
	
	@Autowired
	private ArticleDao articleDao;
	
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody List<Article> changeTitle(@RequestParam(value="game", required=false) Integer game){
		if(game == null){
			return articleDao.getAllArticles();
		}
		return articleDao.getArticlesByGame(game);
	}
	
	//TODO Afficher tous les Articles
	//TODO Afficher les articles selectionnés

}
