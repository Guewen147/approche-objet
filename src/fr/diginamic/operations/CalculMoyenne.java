package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
	private double[] tableau = new double[0] ;


	public void ajout(double nombre) {
		double[] newTableau = new double[tableau.length + 1];
		for (int i =0; i < tableau.length; i++) {
			newTableau[i] = tableau	[i];
		}
		newTableau[tableau.length ] = nombre;
		this.tableau = newTableau;
	}
	
	public double calcul() {
		double somme = 0;
		double moyenne;
		for (int i = 0; i< tableau.length; i++) {
			somme += tableau[i];
		}
		moyenne =somme /(tableau.length);
		return moyenne ;
		
		
	}
	
	
	
	@Override
	public String toString() {
		return "Contenue du Tableau : " + Arrays.toString(tableau) ;
	}


	public double[] getTableau() {
		return tableau;
	}

	public void setTableau(double[] tableau) {
		this.tableau = tableau;
	}
	
}
