package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculMoyenne tab1 = new CalculMoyenne();
		CalculMoyenne tab2 = new CalculMoyenne();
		
		
		tab1.ajout(2.0);
		tab1.ajout(12.0);
		tab1.ajout(20.0);
		
		System.out.println(tab1.calcul());
		System.out.println(tab1);
		
		tab2.ajout(2.34);
		tab2.ajout(12.56);
		tab2.ajout(19.12);
		tab2.ajout(7.33);
	
		System.out.println(tab2.calcul());
		System.out.println(tab2	);
	}

}
