package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import tri.Ville;

public class TestVille2 {
	public static void main(String[] args) {
		
		ArrayList<Ville> listeVille2 = new ArrayList<>();
		listeVille2.add(new Ville("Nice",343000));
		listeVille2.add(new Ville("Carcassonne",47800));
		listeVille2.add(new Ville("Narbonne",53400));
		listeVille2.add(new Ville("Lyon",484000));
		listeVille2.add(new Ville("Foix",9700));
		listeVille2.add(new Ville("Pau",77200));
		listeVille2.add(new Ville("Marseille",850700));
		listeVille2.add(new Ville("Tarbes",40600));
		
		Collections.sort(listeVille2, new ComparatorHabitant());
		
		System.out.println(listeVille2);
		
		Collections.sort(listeVille2, new ComparatorNom());
		
		System.out.println(listeVille2);
		
		
	}
	
	
}
