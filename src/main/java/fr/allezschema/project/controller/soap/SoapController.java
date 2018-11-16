package fr.allezschema.project.controller.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;

import org.springframework.beans.factory.annotation.Autowired;

import fr.allezschema.project.dao.Persistance;
import fr.allezschema.project.model.Personne;

public class SoapController {
	@Autowired
	Persistance persistence;
	@WebMethod
public List<Personne> getAllPersonne() {
	return persistence.getAllPersonne();
}
@WebMethod
public List<Personne> addPersonne(@WebParam(name="personne")Personne p){
		return persistence.addPersonne(p);
	}
@WebMethod
public Personne getPersonne(@WebParam(name="num") int num) {
	return persistence.getPersonne(num);
	
}
@WebMethod
public List<Personne> removePersonne(@WebParam(name="num")int num) {
return persistence.removePersonne(num);
}
}
