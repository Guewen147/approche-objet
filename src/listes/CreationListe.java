package listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> entiers = new ArrayList<>();
		
		int i = 1;
		while ( i<=100) {
		 entiers.add(i);
		 i++;
	 }
		System.out.println(entiers);
		 
		 
		//for ( int i=1; i<=100; i++ ) {
		//	entiers.add(i);
		//	System.out.println(entiers);
		//}
		System.out.println(entiers.size());
		
	}

}
