package fr.diginamic.operations;

public class Operations {
	double a;
	double b;
	char operateur;
	
	public Operations(double a, double b, char operateur) {
		this.a = a;
		this.b = b;
		this.operateur = operateur;
	}

	public String toString() {
		return "a : " + a + ", b : " + b + ", operateur :" + operateur;
	}
	
	public String calcul() {
		double total = 0;
		
		if(operateur == '+') {
			total = a+b;
			return " Le resultat est : " + total;
		} 
		else if(operateur == '-') {
			total = a-b;
			return " Le resultat est : " + total;
		}
		else if (operateur == '*') {
			total = a*b;
			return " Le resultat est : " + total;
		}
		else if (operateur == '/') {
			total = a/b;
			return " Le resultat est : " + total;
		}
		else {
			return " Erreur mauvais operateur ";
		}
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public char getOperateur() {
		return operateur;
	}

	public void setOperateur(char operateur) {
		this.operateur = operateur;
	}
	
}
