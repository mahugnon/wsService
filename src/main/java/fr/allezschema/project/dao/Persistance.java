package fr.allezschema.project.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.stereotype.Service;

import fr.allezschema.project.model.Personne;
@Service
public class Persistance {
private Map<Integer, Personne> personnes=new HashMap<Integer,Personne>();
public Persistance() {
	super();
}
public Map<Integer, Personne> getPersonnes() {
	return personnes;
}
public void setPersonnes(Map<Integer, Personne> personnes) {
	this.personnes = personnes;
}

public List<Personne> getAllPersonne(){
	List<Personne> p=new ArrayList<>();
	personnes.entrySet().forEach(e->{
		p.add(e.getValue());
	});
	return p;
}
public List<Personne> addPersonne(Personne p) {
	personnes.put(personnes.size(), p);
	return getAllPersonne();
}
public Personne getPersonne(Integer num) {
	return personnes.get(num);
}


public List<Personne> removePersonne(Integer num){
	personnes.remove(num);
	return getAllPersonne();
}
}
