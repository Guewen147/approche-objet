package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Saison[] saisons= Saison.values();
		for(Saison saison: saisons) {
			System.out.println(saison.getNom() + " - " + saison.getOrdre());
		}

		String nom = "ETE";
		Saison saison1 = Saison.valueOf(nom);
		System.out.println(saison1.getNom() + " " +saison1.getOrdre());
	
		String libelle = "Hiver";
		Saison saison2 = Saison.rechercheLib(libelle);
		System.out.println(saison2.getNom() + " " +saison2.getOrdre());
	}

}
