package cm.itac.formation.servlet.bean;

import java.awt.Color;

public class Ami {
	private int id;
	private String nom;
	private String prenom;
	private Color couleur;
	private boolean homme;
	private Sport sport;
	
	
	public int getid(){
		return id;
	}
	
	public void setid(int id){
		this.id = id;
	}
	
	public String getNom(){
		return nom;
	}
	
	public void setNom(String nom){
		this.nom = nom;
	}
	
	public String getPrenom(){
		return prenom;
	}
	
	public void setPrenom(String prenom){
		this.prenom = prenom;
	}
	
	public Color getColor(){
		return couleur;
	}
	
	public void setColor(Color couleur){
		this.couleur = couleur;
	}
	
	public boolean getHomme(){
		return homme;
	}
	
	public void setHomme(boolean homme){
		this.homme = homme;
	}
	
	public Sport getSport(){
		return sport;
	}
	
	public void setSport(Sport sport){
		this.sport = sport;
	}
	
	
}


