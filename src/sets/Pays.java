package sets;

public class Pays {
	private String nom;
	private int nbHabitants;
	private double pibHab;
	/**
	 * @param nom
	 * @param nbhabitans
	 * @param pibHab
	 */
	public Pays(String nom, int nbHabitants, double pibHab) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibHab = pibHab;
	}
	
	public double getPibTotal() {
		return pibHab * nbHabitants;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the nbhabitans
	 */
	public int getNbHabitants() {
		return nbHabitants;
	}
	/**
	 * @param nbhabitans the nbhabitants to set
	 */
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	/**
	 * @return the pibHab
	 */
	public double getPibHab() {
		return pibHab;
	}
	/**
	 * @param pibHab the pibHab to set
	 */
	public void setPibHab(double pibHab) {
		this.pibHab = pibHab;
	}
	
	@Override
	public String toString() {
		return nom + " à : " + nbHabitants + " habitants et un PIB de : " + pibHab ;
	}
	
	
}
