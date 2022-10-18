package tri;

import java.util.Comparator;

public class ComparatorNom implements Comparator<Ville>{

	
	public int compare(Ville autre1, Ville autre2) {
		int result = autre1.getNom().compareTo(autre2.getNom());
			return result;	
		}

	

}
