package tri;

public class Ville implements Comparable<Ville> {
	
	private String nom;
	private int nbHabitants;
	
	
	public Ville(String nom, int nbHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}
	
	//public int compareTo(Ville autre) {
	//	int result = this.nom.compareTo(autre.getNom());
	//	return result;	
	//}
	
	//public int compareTo(Ville autre) {
	//	if(this.nbHabitants > autre.getNbHabitants()) {
	//		return 1;
	//		}
	//	if(this.nbHabitants < autre.getNbHabitants()) {
	//		return -1;
	//		}
	//	return 0;
	//}

	
	public String toString() {
		return "Nom : " + nom + ", Habitants : " + nbHabitants + "    \r    ";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	@Override
	public int compareTo(Ville o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
