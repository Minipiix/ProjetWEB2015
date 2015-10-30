package esiea.projetweb2015.controller;

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

	private static final String template = "Voici %s !";
	
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody Article changeTitle(@RequestParam(value="name", required=false, defaultValue="un article") String name){
		return new Article(0,String.format(template, name),null , null, null);
	}
	
	//TODO Afficher tous les Articles
	//TODO Afficher les articles selectionnés

}
