package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		Theatre theatre1 = new Theatre("TR" , 50 , 20 , 10.0);
		
		System.out.println(theatre1.toString());
		
		System.out.println(theatre1.Inscrire(10, 5.0));
		System.out.println(theatre1.Inscrire(9,5.0));
		System.out.println(theatre1.Inscrire(11,5.0));
	}

}
