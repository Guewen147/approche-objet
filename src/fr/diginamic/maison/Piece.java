package fr.diginamic.maison;

public abstract class Piece {
	int etage;
	double superficie;
	
	
	
	public Piece(int etage, double superficie) {
		this.etage = etage;
		this.superficie = superficie;
	}
	
    public abstract String getType();
    
	/**
	 * @return the etage
	 */
	public int getEtage() {
		return etage;
	}

	/**
	 * @param etage the etage to set
	 */
	public void setEtage(int etage) {
		this.etage = etage;
	}

	/**
	 * @return the superficie
	 */
	public double getSuperficie() {
		return superficie;
	}

	/**
	 * @param superficie the superficie to set
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	
	
	
}
