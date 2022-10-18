package fr.diginamic.entites;

public class Theatre {
	String nom;
	int capacite;
	int totClientIns;
	double recette;
	
	public Theatre(String nom, int capacite, int totClientIns, double recette) {
		this.nom = nom;
		this.capacite = capacite;
		this.totClientIns = totClientIns;
		this.recette = recette;
	}

	public String toString() {
		return "Theatre " + nom + " Capacité : " + capacite + ", Client Inscrits : " + totClientIns + ", Recette :"
				+ recette;
	}
	public String Inscrire(int nbrClient, double prixPlace) {
		if(totClientIns + nbrClient <= capacite) {
			totClientIns = totClientIns + nbrClient;
			double prixtot = nbrClient * prixPlace;
			recette = recette + prixtot;
			
			return "Total des client Inscrits : " + totClientIns + " et nouvelle recette : " + recette ;
		} else {
			return "ERREUR Il n'y as plus de place";
		}
		
	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public int getTotClientIns() {
		return totClientIns;
	}

	public void setTotClientIns(int totClientIns) {
		this.totClientIns = totClientIns;
	}

	public double getRecette() {
		return recette;
	}

	public void setRecette(double recette) {
		this.recette = recette;
	}
	
}
