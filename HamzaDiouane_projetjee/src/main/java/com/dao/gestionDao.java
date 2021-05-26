/**
 * 
 */
package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Etudiant;
import com.model.Livre;

import com.dao.DBInteraction;

/**
 * @author khadi
 *
 */
public class gestionDao implements gestion {



	@Override
	public int ajouterLivre(Livre l) {
		DBInteraction.connect();
		int nb=DBInteraction.Maj("insert into livre values(null,'"+l.gettitre()+"','"+l.getauteur()+"','"+l.getcategorie()+"')");
		DBInteraction.disconnect();
		return nb;
	}

	@Override
	public int ajouterLivre(String titre, String auteur, String categorie) {
	
		DBInteraction.connect();
		int nb=DBInteraction.Maj("insert into livre values(null,'"+titre+"','"+auteur+"','"+categorie+"')");
		DBInteraction.disconnect();
		return nb;
	}

	@Override
	public List<Livre> cherparcate(String categorie) {
		List<Livre> l=new ArrayList<Livre>();
		DBInteraction.connect();
		ResultSet rs = DBInteraction.select("select * from livre where categorie='"+categorie+"'");
		try {
			if (rs.next())
			{
			try {
				while(rs.next())
				{
				Livre l1=new Livre( rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
				l.add(l1);
				}
			    } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} }
			else 
				l=null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	private String getString(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Livre> cherparaut(String auteur) {
		List<Livre> l=new ArrayList<Livre>();
		DBInteraction.connect();
		ResultSet rs = DBInteraction.select("select * from livre where auteur='"+auteur+"'");
		try {
			if (rs.next())
			{
			try {
				while(rs.next())
				{
				Livre l1=new Livre( rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
				l.add(l1);
				}
			    } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} }
			else 
				l=null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public List<Livre> toutlivres() {
		List<Livre> Livres=new ArrayList<Livre>();
		DBInteraction.connect();
		ResultSet rs = DBInteraction.select("select * from livre ");
		try {
			while(rs.next())
			{
			Livre l=new Livre( rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			Livres.add(l);
			}
		    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Livres;
	}


	@Override
	public int ajouteretudiant(Etudiant e) {
		DBInteraction.connect();
		int nb=DBInteraction.Maj("insert into etudiant values(null,'"+e.getNom()+"','"+e.getPrenom()+"','"+e.getLog()+"','"+e.getPass()+"')");
		DBInteraction.disconnect();
		return nb;
		
	}

	@Override
	public int ajouteretudiant(String nom, String prenom, String log, String pass) {

		DBInteraction.connect();
		int nb=DBInteraction.Maj("insert into etudiant values(null,'"+nom+"','"+prenom+"','"+log+"','"+pass+"')");
		DBInteraction.disconnect();
		return nb;
	}
	@Override
	public Etudiant authentification(String lg, String pss) {
		Etudiant et=null;
		DBInteraction.connect();
		ResultSet rs = DBInteraction.select("select * from etudiant where log='"+lg+"' and pass='"+pss+"'");
		try {
			if(rs.next())
			{
				et=new Etudiant();
				et.setId(rs.getInt(1));
				et.setNom(rs.getString(2));
				et.setPrenom(rs.getString(3));
				et.setLog(rs.getString(4));
				et.setPass(rs.getString(5));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return et;
	
	}


}
