package fr.diginamic.entites;

	public class Cercle {
		double rayon;

		public Cercle(double rayon) {
			this.rayon = rayon;
		}

		public String toString() {
			return " Rayon :" + rayon ;
		}
		
		double pi = 3.14;
		double perimetre;
		public double Perimetre() {
			perimetre = 2 * pi * rayon;
			return perimetre;
		}
		double surface;
		public double Surface() {
			surface = pi * (rayon * rayon);
			return surface ;
		}
		
		
		
	}
