package fr.diginamic.essais;

import fr.diginamic.salaire.Intervenant;
import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		
		Salarie s1 = new Salarie("James", "Call", 1200.32);
		Pigiste p1 = new Pigiste("Fenol", "Edward", 10, 70.23);
		
		
		System.out.println(p1.getSalaire());
		System.out.println(s1.getSalaire());
		System.out.println(p1.afficherDonnees());
		System.out.println(s1.afficherDonnees());
	}

}
