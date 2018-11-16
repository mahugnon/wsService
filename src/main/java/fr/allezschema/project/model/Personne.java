package fr.allezschema.project.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Personne implements Serializable{
private String nom;
private String prenom;
public Personne() {
	super();
}
public Personne(String nom, String prenom) {
	super();
	this.nom = nom;
	this.prenom = prenom;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
@Override
public String toString() {
	return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
}

}
