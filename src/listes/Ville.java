package listes;

import fr.diginamic.testenumeration.Continent;

/**
 * Représente le concept de Ville avec un nom et un nombre d'habitants.
 * @author Guewen
 *
 */
public class Ville {
	/** Nom de la Ville */
	 private String nom;
	 
	 /** Nombre d'habitants */
	 private int nbHabitant;
	 
	 /** Nom du Continent */
	 public Continent libelle;
	 
	/**
	 * Constructeur
	 * @param nom : Nom de la vjlle
	 * @param nbHabitant : Nombre d'Habitants
	 * @param libelle : nom du continent
	 */
	public Ville(String nom, int nbHabitant, Continent libelle) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.libelle = libelle;
	}
	
	public Ville(String nom, int nbHabitant) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}

	public String toString() {
		return  "Nom : " + nom + " ------   Habitant " + nbHabitant  + "         du Continent : " + libelle;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Ville)) {
			return false;
		}
		Ville autre = (Ville)obj;
		return autre.nom.equals(this.nom) && autre.getNbHabitant()==this.getNbHabitant();
		
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitant() {
		return nbHabitant;
	}

	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}


	/**
	 * @return the libelle
	 */
	public Continent getLibelle() {
		return libelle;
	}


	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(Continent libelle) {
		this.libelle = libelle;
	}
	
	
	
	
	
}
