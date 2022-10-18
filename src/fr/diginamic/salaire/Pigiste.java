package fr.diginamic.salaire;

public class Pigiste extends Intervenant{
	int nbJoursMois;
	double montantJour;
	
	
	
	
	public Pigiste(String nom, String prenom, int nbJoursMois, double montantJour) {
		super(nom, prenom);
		this.nbJoursMois = nbJoursMois;
		this.montantJour = montantJour;
	}


	public double getSalaire() {
		double salaire = nbJoursMois * montantJour;
		return salaire;
	}


	public String afficherDonnees() {
		// TODO Auto-generated method stub
		return "L'intervenant se nomme : " + nom + prenom + "\r Son salaire : " + getSalaire() + " et son statut est : " + getStatut() ;
	}


	public String getStatut() {
		return "Pigiste";
	}
}
