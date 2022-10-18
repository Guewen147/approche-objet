package tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville>{

	@Override
	public int compare(Ville autre1, Ville autre2) {
		if(autre1.getNbHabitants() > autre2.getNbHabitants()) {
			return 1;
			}
		if(autre1.getNbHabitants() < autre2.getNbHabitants()) {
			return -1;
			}
		return 0;
		
	}

}
