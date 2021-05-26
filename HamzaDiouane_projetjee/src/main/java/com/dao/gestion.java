/**
 * 
 */
package com.dao;

import java.util.List;

import com.model.Etudiant;
import com.model.Livre;

/**
 * @author hp
 *
 */
public interface gestion {
	public int ajouterLivre(Livre l);
	public int ajouterLivre(String titre, String auteur, String categorie);
	public List<Livre> cherparcate(String categorie);
	public List<Livre> cherparaut(String auteur);
	public List<Livre> toutlivres();
	public Etudiant authentification(String log, String pass);
	public int ajouteretudiant(Etudiant e);
	public int ajouteretudiant(String nom, String prenom, String log, String pass);

}
