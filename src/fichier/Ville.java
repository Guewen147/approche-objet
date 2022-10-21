package fichier;

public class Ville {

	String nomV ;
	int codeD ;
	String nomR ;
	int pop ;
	
	public Ville(String nomV, int codeD, String nomR, int pop) {
		
		this.nomV = nomV;
		this.codeD = codeD;
		this.nomR = nomR;
		this.pop = pop;
	}

	@Override
	public String toString() {
		return "Ville : " + nomV + " - " + codeD + " - " +  nomR + " - " + pop  ;
	}

	public String getNomV() {
		return nomV;
	}

	public void setNomV(String nomV) {
		this.nomV = nomV;
	}

	public int getCodeD() {
		return codeD;
	}

	public void setCodeD(int codeD) {
		this.codeD = codeD;
	}

	public String getNomR() {
		return nomR;
	}

	public void setNomR(String nomR) {
		this.nomR = nomR;
	}

	public int getPop() {
		return pop;
	}

	public void setPop(int pop) {
		this.pop = pop;
	}
	
}
