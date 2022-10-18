package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Compte[] comptes = new Compte[2];
		comptes[0] = new Compte("1", 100);
		comptes[1] = new CompteTaux ("2", 200, 1.4);
		
		for (int i=0; i<comptes.length; i++) {
		System.out.println(comptes[i]);
		}
	}

}
