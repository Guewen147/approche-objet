package fr.diginamic.formes;

public class Rectangle extends Forme {
	double longueur;
	double largeur;
	
	
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	double surface;
	public double calculerSurface() {
		surface = longueur * largeur;
		return surface;
	}
	double perimetre ;
	public double calculerPerimetre() {
		 perimetre = (longueur + largeur) * 2;
		 return perimetre;
	}
	
	public String toString() {
		return "Rectangle \r Surface : " + calculerSurface() + " et Perimetre : " + calculerPerimetre();
	}
	
	public double getLongueur() {
		return longueur;
	}
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
	public double getLargeur() {
		return largeur;
	}
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	
}
