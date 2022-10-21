package sets;

import java.util.HashSet;

public class TestPays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Pays> set = new HashSet<Pays>();
		set.add(new Pays("Usa", 329500000, 63543.58));
		set.add(new Pays("France", 67390000, 38625.07));
		set.add(new Pays("Allemagne", 83240000, 45723.64));
		set.add(new Pays("Uk", 67220000, 40284.64));
		set.add(new Pays("Italie", 69550000, 31676.20));
		set.add(new Pays("Japon", 125800000, 40113.06));
		set.add(new Pays("Chine", 1402000000, 10500.40));
		set.add(new Pays("Russie", 144100000, 10126.72));
		set.add(new Pays("Inde", 1380000000, 1900.71));
	
		Pays pays1 = new Pays("Inde", 1380000000, 1900.71); // j

		for (Pays pays : set) {
			if (pays.getPibHab() > pays1.getPibHab()) {
				pays1 = pays;
			}
		}
		System.out.println("PAys - PIB par Hab le plus élevé: " + pays1);
	
		

		for (Pays pays : set) {
			if (pays.getPibTotal() > pays1.getPibTotal()) {
				pays1 = pays;
			}
		}
		System.out.println("PAys - PIB total le plus élevé: " + pays1 + " avec un PIB total : " + pays1.getPibTotal());
	
		
		
		for (Pays pays : set) {
			if (pays.getPibTotal() < pays1.getPibTotal()) {
				pays1 = pays;
			}
		}
		
		System.out.println("PAys - PIB total le plus petit: " + pays1 + " avec un PIB total : " + pays1.getPibTotal());
		
		String maj = pays1.getNom().toUpperCase();
		pays1.setNom(maj);
		
		for (Pays pays : set) {

			System.out.println(pays);
		}
		
		set.remove(pays1);
		
		System.out.println("");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("");
		
		for (Pays pays : set) {

			System.out.println(pays);
		}
	}

}
