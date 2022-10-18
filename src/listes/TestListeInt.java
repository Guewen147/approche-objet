package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestListeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> liste= new ArrayList<Integer>();
		liste.add(-1);
		liste.add(5);
		liste.add(7);
		liste.add(3);
		liste.add(-2);
		liste.add(4);
		liste.add(8);
		liste.add(5);
		
		System.out.println(liste);
		System.out.println("Taille de la liste : " + liste.size());
		
		int maxVal = Integer.MIN_VALUE;
		
		for(int i = 0; i < liste.size(); i++){
	         if(liste.get(i) > maxVal)
	           maxVal = liste.get(i);
		}
		
		System.out.println("La valeur la plus grande : " + maxVal);
	
		int minVal = Integer.MAX_VALUE;
		
		for(int i = 0; i < liste.size(); i++){
	         if(liste.get(i) < minVal)
	           minVal = liste.get(i);
		}
		
		Iterator<Integer> iter = liste.iterator();
		while (iter.hasNext()) {
			Integer min = iter.next();
			if (min == minVal) {
				iter.remove();
			}
		}
		System.out.println("La valeur la plus petite : " + minVal);
		System.out.println("Le tableau : " + liste);
	
		
		
		ArrayList<Integer> positif = new ArrayList<Integer>();
		positif.addAll(Arrays.asList( -1, 5, 7, 3, -2, 4, 8, 5));
		for(int i = 0; i < positif.size(); i++){
			if (positif.get(i) < 0 ) {
				positif.set(i, - positif.get(i));
			}
		}
		System.out.println(positif);
	}
	

}
