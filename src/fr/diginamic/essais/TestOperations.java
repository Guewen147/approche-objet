package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		
		 
		Operations calculs1  = new Operations(12, 2 , '+');
		Operations calculs2  = new Operations (6, 5 ,'-');
		Operations calculs3  = new Operations (7, 9 ,'*');
		Operations calculs4  = new Operations (1, 4 ,'/');
			
			System.out.println(calculs1.toString());
			System.out.println(calculs1.calcul());
			
			System.out.println(calculs2.toString());
			System.out.println(calculs2.calcul());
			
			System.out.println(calculs3.toString());
			System.out.println(calculs3.calcul());
			
			System.out.println(calculs4.toString());
			System.out.println(calculs4.calcul());
			
	}

}
