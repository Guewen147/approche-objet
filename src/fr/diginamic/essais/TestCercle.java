package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {

		Cercle[] cercles = new Cercle[3];
		cercles[0] = new Cercle(3.10);
		cercles[1] = new Cercle (6);
		cercles[2] = CercleFactory.retourCercle(6);
		
		
		for (int i=0; i<cercles.length; i++) {
			System.out.println(" Perimetre :" + cercles[i].Perimetre());
			System.out.println(" Surface :" + cercles[i].Surface());
			}
		
	}
	
}
