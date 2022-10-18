package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;


public class TestOperation {

	public static void main(String[] args) {
		
		Credit c1 = new Credit ("01/01/22", 100.0);
		Credit c2 = new Credit ("02/02/22", 800.0);
		Debit d1 = new Debit ("03/03/22", 300.0);
		Debit d2 = new Debit ("04/04/22", 400.0);
		
		Operation[] operations = new Operation[4];
		operations[0] = c1;
		operations[1] = c2;
		operations[2] = d1;
		operations[3] = d2;
		
		
		double somme = 0;
		for (int i=0; i<operations.length; i++) {
			if(operations[i].getType().equals("CREDIT")) {
				somme = operations[i].getMontantOperation() +somme;
			}else {
				somme = somme - operations[i].getMontantOperation();
			}
			System.out.println( "Type de l'operation : " + operations[i].getType() + " " +operations[i] );
		}
		System.out.println(somme);
	}

}
