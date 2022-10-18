package fr.diginamic.essais;

import fr.diginamic.chaines.ManipulationChaine;
import fr.diginamic.entites.Salarie;

public class TestManipChaine {

	public static void main(String[] args) {
		ManipulationChaine chaine = new ManipulationChaine ("Durand;Marcel;2 523.5");
		
		
		System.out.println("Premier caractère : "+ chaine.premierChar());
		System.out.println("Longueur de la chaine : "+ chaine.longueurChar());
		System.out.println("Index du Premier : "+ chaine.indexPremier());
		System.out.println("Nom de famille : "+ chaine.nomDeFamille());
		System.out.println("Nom de famille en MAJ : "+ chaine.nomDeFamilleMaj());
		System.out.println("Nom de famille en MIN : "+ chaine.nomDeFamilleMin());
		
		
		System.out.println( chaine.separer());
		System.out.println( chaine.personne());
	
	}

}
