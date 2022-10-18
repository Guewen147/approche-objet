package entites;

import entites.AdressePostale;
import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale uneAdresse1 = new AdressePostale(24, "rue de lavolée", 56300 , "Vannes");
		AdressePostale uneAdresse2 = new AdressePostale(60, "rue de la paix", 56324 , "Lorient");
		Personne unePersonne1 = new Personne("Adis", "Jacques", uneAdresse1);
		Personne unePersonne2 = new Personne("Damien", "James", uneAdresse2);
	
		String identite = unePersonne1.afficherIdentite();
		System.out.println(identite);
	}

}
