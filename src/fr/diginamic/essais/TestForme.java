package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {

		Cercle c1 = new Cercle(4);
		Carre ca1 = new Carre(2);
		Rectangle r1 = new Rectangle(2, 3);
		
		AffichageForme af = new AffichageForme();

		System.out.println(af.afficher(ca1));
		System.out.println(af.afficher(c1));
		System.out.println(af.afficher(r1));
	}

}
