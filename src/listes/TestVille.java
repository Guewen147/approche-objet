package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestVille {

	public static void main(String[] args) {
		
		ArrayList<Ville> listeVille = new ArrayList<>();

		listeVille.add(new Ville("Nice",343000));
		listeVille.add(new Ville("Carcassonne",47800));
		listeVille.add(new Ville("Narbonne",53400));
		listeVille.add(new Ville("Lyon",484000));
		listeVille.add(new Ville("Foix",9700));
		listeVille.add(new Ville("Pau",77200));
		listeVille.add(new Ville("Marseille",850700));
		listeVille.add(new Ville("Tarbes",40600));
		
		int habitant = 0;
		Ville ville1 = null;
		String villeMax = "" ;
		for(int i= 0 ; i < listeVille.size(); i++) {
			ville1 = listeVille.get(i);
			if(ville1.getNbHabitant() > habitant) {
				habitant = ville1.getNbHabitant();
				villeMax = ville1.getNom();
			}
			
		}
		System.out.println(habitant + "     " + villeMax);
		
		
		
		int habitant2 =10000000;
		Ville ville2 = null;
		String villeMin = "" ;
		for(int i= 0 ; i < listeVille.size(); i++) {
			ville2 = listeVille.get(i);
			if(ville2.getNbHabitant() < habitant2) {
				habitant2 = ville2.getNbHabitant();
				villeMin = ville2.getNom();
			}
			
		}
		System.out.println(habitant2 + "     " + villeMin);
		listeVille.remove(villeMin);
		
		
		Ville ville3 = null;
		Iterator<Ville> iter= listeVille.iterator();
		while(iter.hasNext()) {
			ville3 = iter.next();
			if(ville3.getNbHabitant() > 100000) {
				 ville3.setNom(ville3.getNom().toUpperCase());
				 
					}
				System.out.println(ville3);
				
			}
		

		
		
	}

}
