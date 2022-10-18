package fr.diginamic.banque.entites;

public class Compte {
	public String numeroDeCompte;
	public int soldeDeCompte;
	
	
	public Compte(String numeroDeCompte, int soldeDeCompte) {
		this.numeroDeCompte = numeroDeCompte;
		this.soldeDeCompte = soldeDeCompte;
	}


	public String toString() {
		return " Numero de compte =" + numeroDeCompte + ", Solde de Compte=" + soldeDeCompte;
	}
	
	
}
