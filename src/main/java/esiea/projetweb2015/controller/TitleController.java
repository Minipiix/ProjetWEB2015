package esiea.projetweb2015.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import esiea.projetweb2015.model.Title;

@RestController
@RequestMapping("/title")
public class TitleController {
	private static final String template = "Toute l'actus de %s!";
	
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody Title changeTitle(@RequestParam(value="name", required=false, defaultValue="Blizzard") String name){
		return new Title(String.format(template, name));
	}
}
