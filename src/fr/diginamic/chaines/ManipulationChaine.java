package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {
	public String chaine= "Durand;Marcel;2 523.5";

	public ManipulationChaine(String chaine) {
		this.chaine = chaine;
	}
	
	public char premierChar() {
		char premierCaractere= chaine.charAt(0);
		return premierCaractere;
	}
	
	public  int longueurChar() {
		int longueur = chaine.length();
		return longueur;
	}
	
	public  int indexPremier() {
		int indexPrem = chaine.indexOf(';');
		return indexPrem;
	}
	
	
	public  String nomDeFamille() {
		String nom = chaine.substring( 0 , chaine.indexOf(";"));
		return nom;
	}
	public  String nomDeFamilleMaj() {
		String nomMaj = chaine.substring( 0 , chaine.indexOf(";"));
		nomMaj = nomMaj.toUpperCase();
		return nomMaj;
	}
	
	public  String nomDeFamilleMin() {
		String nomMin = chaine.substring( 0 , chaine.indexOf(";"));
		nomMin = nomMin.toLowerCase();
		return nomMin;
	}
	
	public String separer() {
		String[] separe = chaine.split(";");
		for (int i=0; i< separe.length ; i++) {
			System.out.println("Valeur chaine: "+ separe[i]);
		
		}
		return "La chaine a bien été retourner";
	}
	
	public String personne() {
		String[] salarie = chaine.split(";");
		 String nom = salarie[0];
		 String prenom = salarie[1];
		 String salaire = salarie[2].replace(" ", "");
		 double salaireb= Double.parseDouble(salaire);
		 Salarie salarie1 = new Salarie (nom, prenom, salaireb);
		 return "Nom :" + nom + " Prenom :" + prenom + " salaire :" + salaireb;
	}

	
	
	
	
	
	public String getChaine() {
		return chaine;
	}

	public void setChaine(String chaine) {
		this.chaine = chaine;
	}
	
}
