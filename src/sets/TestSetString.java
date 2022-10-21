package sets;

import java.util.Arrays;
import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {
		HashSet<String> stringSet = new HashSet<>();
		stringSet.addAll(Arrays.asList("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));
	
		String lettreMax = "a";
	
		for (String nom : stringSet) {
			if (nom.length() > lettreMax.length()) {
				lettreMax = nom;
			}
		}
		System.out.println("Pays avec plus de lettres : " + lettreMax);
	
		stringSet.remove(lettreMax);
		System.out.println(" ");
		System.out.println("--------------------------------------------");
		
		for (String nom : stringSet) {
			System.out.println(nom);
		}
}
}
