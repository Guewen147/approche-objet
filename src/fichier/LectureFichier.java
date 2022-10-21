package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		
		Path pathFile= Paths.get("C:/Users/guewe/Downloads/recensement.csv");
		List<String> lines= Files.readAllLines(pathFile, StandardCharsets.UTF_8);
		//for (String l : lines) {
		//	System.out.println(l);
		//}
		Path pathFile2= Paths.get("C:/Users/guewe/Downloads/recensement3.csv");
		
		ArrayList<Ville> lVille = new ArrayList<>();
		
		for( int i = 1 ; i <lines.size(); i++) {
			String[] liste = lines.get(i).split(";");
			String nomV = liste[6];
			int codeD = Integer.parseInt(liste[3].replaceAll(" ", ""));
			String nomR = liste[2];
			int pop = Integer.parseInt(liste[9].replaceAll(" ", ""));
			
		
			Ville v = new Ville(nomV, codeD , nomR , pop);
			lVille.add(v);
		}
		
		ArrayList<String> villeVoulu = new ArrayList<>();
		for( int i = 1 ; i <lVille.size(); i++ ) {
			if(lVille.get(i).getPop() >= 25000) {
				villeVoulu.add(lVille.get(i).getNomV()+";"+lVille.get(i).getCodeD()+";"+lVille.get(i).getNomR()+";"+lVille.get(i).getPop());
			}	
		}

		Files.write(pathFile2, villeVoulu);
		
		for (String l1 : villeVoulu) {
		System.out.println(l1);
		}
		
	}

}
