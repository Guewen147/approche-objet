package fr.diginamic.maison;

public class Maison {
	Piece[] tabPiece = new Piece[0];
	
	
	public void ajoutPiece(Piece piece) {
		double[] newTableau = new double[tableau.length + 1];
		for (int i =0; i < tableau.length; i++) {
			newTableau[i] = tableau	[i];
		}
		newTableau[tableau.length ] = nombre;
		this.tableau = newTableau;
	}
	
	public String superFicieTot() {
		
		return superficieMaison;
	}
	
	public String superficieEtage() {
	
		return etageSuperficie;
	}
}
