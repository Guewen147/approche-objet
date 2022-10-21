package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maison maison1 = new Maison();
		
		maison1.ajoutPiece(new Chambre(0,18));
		maison1.ajoutPiece(new Cuisine(0,25));
		maison1.ajoutPiece(new WC(0,7));
		maison1.ajoutPiece(new Salon(0,32));
		maison1.ajoutPiece(new SalleDeBain(0,12));
		
		maison1.ajoutPiece(new Chambre(1,20));
		maison1.ajoutPiece(new Chambre(1,20));
		maison1.ajoutPiece(new WC(1,3));
		maison1.ajoutPiece(new Chambre(1,20));
		maison1.ajoutPiece(new SalleDeBain(1,11));
		
		maison1.ajoutPiece(null);
		
		System.out.println("Superficie Etage 0 : " + maison1.superficieEtage(0));
		System.out.println("Superficie Etage 1 : " + maison1.superficieEtage(1));
		System.out.println("Superficie Total : " + maison1.superficieTot());
		maison1.ajoutPiece(new SalleDeBain(-1,11));
		System.out.println("Superficie Etage -1 : " + maison1.superficieEtage(-1));
		maison1.ajoutPiece(new SalleDeBain(1,-24));
		System.out.println("Superficie Etage 1 : " + maison1.superficieEtage(1));
		
		System.out.println("Superficie Chambre : " +maison1.superficieTypePiece("Chambre"));
		System.out.println("Nombre Chambre : " +maison1.nombreTypePiece("Chambre"));

	}

}
