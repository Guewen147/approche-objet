package fr.diginamic.banque.entites;


public class CompteTaux extends Compte{
	
	public double tauxDeRemuneration;

	public CompteTaux(String numeroDeCompte, int soldeDeCompte,double tauxDeRemuneration) {
		super(numeroDeCompte, soldeDeCompte);
		this.tauxDeRemuneration = tauxDeRemuneration;
	}

	
	public String afficheCompteTaux() {
		String chaine = super.toString();
		return chaine  +"Taux de remuneration "  + tauxDeRemuneration;
	}


	public double getTauxDeRemuneration() {
		return tauxDeRemuneration;
	}


	public void setTauxDeRemuneration(double tauxDeRemuneration) {
		this.tauxDeRemuneration = tauxDeRemuneration;
	}
	
}

