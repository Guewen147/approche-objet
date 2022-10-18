package fr.diginamic.banque.entites;

public abstract class Operation {
 String dateOperation;
 double montantOperation;
 
public Operation(String dateOperation, double montantOperation) {
	this.dateOperation = dateOperation;
	this.montantOperation = montantOperation;
}


public abstract String getType() ;


public String toString() {
	return "Date de l'operation : " + dateOperation + ", et le montant de l'operation : " + montantOperation ;
}


public String getDateOperation() {
	return dateOperation;
}

public void setDateOperation(String dateOperation) {
	this.dateOperation = dateOperation;
}

public double getMontantOperation() {
	return montantOperation;
}

public void setMontantOperation(double montantOperation) {
	this.montantOperation = montantOperation;
}
 
}
