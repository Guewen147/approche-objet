package fr.diginamic.formes;

public class Carre extends Forme {
	double longueur;

	public Carre(double longueur) {
		this.longueur = longueur;
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
	

	public String toString() {
		return "Carre \r Surface : " + calculerSurface() + " et Perimetre : " + calculerPerimetre();
	}


	
	
	public double calculerSurface() {
		double surface;
		surface = longueur * longueur ;
		return surface ;
	}

	public double calculerPerimetre() {
		double perimetre;
		// TODO Auto-generated method stub
		perimetre = longueur * 4;
		return perimetre;
	}
	
}
