/**
 * 
 */
package com.model;

/**
 * @author hp
 *
 */
public class Livre {
	int id;
	String titre,auteur,categorie;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String gettitre() {
		return titre;
	}
	public void settitre(String titre) {
		this.titre = titre;
	}
	public String getauteur() {
		return auteur;
	}
	public void setauteur(String auteur) {
		this.auteur = auteur;
	}
	
	public String getcategorie() {
		return categorie;
	}
	public void setcategorie(String categorie) {
		this.categorie = categorie;
	}
	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Livre(int id, String titre, String auteur, String categorie) {
		super();
		this.id = id;
		this.titre = titre;
		this.auteur = auteur;
		this.categorie = categorie;
	}
	public Livre(String titre, String auteur, String categorie) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.categorie = categorie;
	}
	

}


