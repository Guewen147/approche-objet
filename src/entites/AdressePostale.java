package entites;

public class AdressePostale {
	int numeroDeRue;
	String libelleDeRue;
	int codePostal;
	String ville;
	
	public AdressePostale(int numeroDeRue, String libelleDeRue, int codePostal, String ville) {
		this.numeroDeRue = numeroDeRue;
		this.libelleDeRue = libelleDeRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public int getNumeroDeRue() {
		return numeroDeRue;
	}

	public void setNumeroDeRue(int numeroDeRue) {
		this.numeroDeRue = numeroDeRue;
	}

	public String getLibelleDeRue() {
		return libelleDeRue;
	}

	public void setLibelleDeRue(String libelleDeRue) {
		this.libelleDeRue = libelleDeRue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	
}

