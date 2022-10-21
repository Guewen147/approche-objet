package fr.diginamic.testenumeration;

public enum Saison {

	/** 
	 * Constante des instances des quatre saisons 
	 * avec deux atribut : Son nom et Son numero d'ordre 
	 */
	PRINTEMPS("Printemps", 1),
	ETE("Ete", 2),
	AUTOMNE("Automne", 3),
	HIVER("Hiver", 4);
	
	/** Nom de la Saison */
	private String nom;
	
	/** Numero d'ordre de la saison */
	private int ordre;
	
	/**
	 * Constructeur
	 * @param nom : Nom de la Saison
	 * @param ordre : Numero d'ordre
	 */
	private Saison(String nom, int ordre) {
		this.nom = nom;
		this.ordre = ordre;
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
	 * @return the ordre
	 */
	public int getOrdre() {
		return ordre;
	}

	/**
	 * @param ordre the ordre to set
	 */
	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}
	
	public static Saison rechercheLib(String libelle) {
		Saison[] saisons = Saison.values();
		for(Saison saison : saisons) {
			if(saison.getNom().equalsIgnoreCase(libelle)) {
				return saison;
			}
		}
		return null;
	}
	
}
