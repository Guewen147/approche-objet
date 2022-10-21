package fr.diginamic.testenumeration;

import java.util.ArrayList;

import listes.Ville;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Ville> listeVille = new ArrayList<>();

		listeVille.add(new Ville("New York",8804000, Continent.AMERIQUE));
		listeVille.add(new Ville("Paris",2244000, Continent.EUROPE));
		listeVille.add(new Ville("Pekin",21890000, Continent.ASIE));
		listeVille.add(new Ville("Moscou",13010000, Continent.ASIE));
		listeVille.add(new Ville("Berlin",3769000, Continent.EUROPE));
		listeVille.add(new Ville("Sydney",5231000, Continent.OCEANIE));
		listeVille.add(new Ville("Sao Paulo",12400000,Continent.AMERIQUE));
		listeVille.add(new Ville("Dakar",1146000,Continent.AFRIQUE ));
		
		for(Ville v : listeVille) {
			System.out.println(v);
		}
	}

}
