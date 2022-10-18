package maps;

import java.util.HashMap;
import java.util.Iterator;

import listes.Ville;

public class MapVilles {
	public static void main(String[] args) {

	HashMap<String,Integer > mapV = new HashMap<>();
	mapV.put("Nice",343000);
	mapV.put("Carcassonne",47800);
	mapV.put("Narbonne",53400);
	mapV.put("Lyon",484000);
	mapV.put("Foix",9700);
	mapV.put("Pau",77200);
	mapV.put("Marseille",850700);
	mapV.put("Tarbes",40600);
	
	Iterator<String> itVilles = mapV.keySet().iterator();
	int habitant =Integer.MAX_VALUE;
	String villeMin = null ;
	while(itVilles.hasNext()) {
		String villeN = itVilles.next();
		Integer ville = mapV.get(villeN);
		
		if(ville < habitant) {
			habitant = ville;
			villeMin = villeN;
		}
		
	}
	System.out.println(villeMin);
	mapV.remove(villeMin);
	
	System.out.println(mapV);
	}
	
}
