package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class TestListeString {
	
	public static void main(String[] args) {
	ArrayList<String> ville = new ArrayList<String>();
	ville.addAll(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));
	
	int maxChar = 0;
	String nom = null;
	for(int i = 0; i < ville.size(); i++){
		if(ville.get(i).length() > maxChar) {
	         maxChar  = ville.get(i).length();
			 nom = ville.get(i);
		}
	}
	
	System.out.println("La ville ayant le plus de lettres est  : " + nom + " avec " + maxChar + " lettres");
	
	ArrayList<String> villeMaj = new ArrayList<String>();
	villeMaj.addAll(ville);
	
	for(int i = 0; i < villeMaj.size(); i++){
	villeMaj.set(i, villeMaj.get(i).toUpperCase());
	}
	System.out.println(villeMaj);
	
	
	
	Iterator<String> iter= ville.iterator();
	while(iter.hasNext()) {
		String ville2 = iter.next();
		if(ville2.startsWith("N")) {
		iter.remove();
		}
		System.out.println(ville);
	}
	
	
	}
	
	
	
}
