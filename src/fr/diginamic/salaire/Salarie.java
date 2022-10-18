package fr.diginamic.salaire;

public class Salarie extends Intervenant {

	double salaireMens;
	
	
	public Salarie(String nom, String prenom, double salaireMens) {
		super(nom, prenom);
		this.salaireMens = salaireMens;
		
	}

	
	public double getSalaire() {
		return salaireMens;
	}


	public String afficherDonnees() {
		return "L'intervenant se nomme : " + nom + prenom + "\r Son salaire : " + getSalaire() + " et son statut est : " + getStatut() ;
	}


	@Override
	public String getStatut() {
		
		return "Salarie";
	} 

}
