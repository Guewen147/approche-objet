package fr.diginamic.formes;

public class Cercle extends Forme{
	double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}


	double surface;
	double pi = 3.14;
	public double calculerSurface() {
		surface = pi * (rayon * rayon);
		return surface ;
	}

	double perimetre;
	public double calculerPerimetre() {
		perimetre = 2 * pi * rayon;
		return perimetre;
	}
	
	public String toString() {
		return "Cercle \r Surface : " + calculerSurface() + " et Perimetre : " + calculerPerimetre();
	}
	
	
	
}
