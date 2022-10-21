package fr.diginamic.maison;

public class Maison {
	private Piece[] tab;
	
	public Maison() {
		tab = new Piece[0];
	}
	
	public void ajoutPiece(Piece nPiece) {
		Piece[] newTableau = new Piece[tab.length + 1];
		for (int i =0; i < tab.length; i++) {
			newTableau[i] = tab[i];
			
		}
		if(nPiece != null) {
		newTableau[tab.length] = nPiece;
		this.tab = newTableau;
		}
	}
	
	
	
	public double superficieEtage(int choixEtage) {
	double superficieEtage=0;
	for (int i =0; i < tab.length; i++){
		if(tab[i].getEtage() >= 0) {
			if(choixEtage == tab[i].getEtage()) {
				if(tab[i].getSuperficie() > 0) {
					superficieEtage = superficieEtage + tab[i].getSuperficie();
				}
			}
		}
	}
		return superficieEtage;
	}
	
	public double superficieTot() {
	double superficieTot= 0;
	for (int i=0; i<tab.length; i++) {
		if(tab[i].getSuperficie() > 0) {
			superficieTot = superficieTot + tab[i].getSuperficie();
		}
	}
		return superficieTot;
	}
	
	public double superficieTypePiece(String type) {
		double superficie = 0;
		for (int i=0; i<tab.length; i++) {
			if(type.equals(this.tab[i].getType())) {
				superficie = superficie + tab[i].getSuperficie();
			}
		}
			return superficie;
		}
	
	public int  nombreTypePiece(String type) {
		int nombre = 0;
		for (int i=0; i<tab.length; i++) {
			if(type.equals(this.tab[i].getType())) {
				nombre = nombre+1;
			}
		}
			return nombre;
		}
	
}
