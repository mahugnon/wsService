package fr.allezschema.project.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.allezschema.project.dao.Persistance;
import fr.allezschema.project.model.Personne;

@RestController
public class RsController {
	@Autowired
	Persistance persistence;
	@RequestMapping(value="/personnes", method=RequestMethod.GET)
	@ResponseBody
public List<Personne> getAllPersonne() {
	return persistence.getAllPersonne();
}
@ResponseBody
@RequestMapping(value="/personnes", method=RequestMethod.POST)
public List<Personne> addPersonne(@RequestBody Personne p){
		return persistence.addPersonne(p);
	}
@RequestMapping(value="/personnes/{num}", method=RequestMethod.GET)
@ResponseBody
public Personne getPersonne(@PathVariable("num") int num) {
	return persistence.getPersonne(num);
	
}
@RequestMapping(value="/personnes/{num}", method=RequestMethod.DELETE)
@ResponseBody
public List<Personne> removePersonne(@PathVariable("num")int num) {
return persistence.removePersonne(num);
}
}
