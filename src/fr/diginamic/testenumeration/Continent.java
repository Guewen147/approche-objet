package fr.diginamic.testenumeration;

public enum Continent {

	/** 
	 * Constante des instances des cinqs continents 
	 * avec un atribut : Son nom 
	 */
	AFRIQUE("Afrique"),
	AMERIQUE("Amerique"),
	ASIE("Asie"),
	EUROPE("Europe"),
	OCEANIE("Oceanie");
	
	/** libelle des continents */
	public String libelle;
	
	/**
	 * Constructeur
	 * @param libelle : libelle des continents
	 */
	Continent(String libelle) {
		this.libelle = libelle;
		
	}
	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
}
