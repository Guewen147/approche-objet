package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {
	public static void main(String[] args) throws IOException {

	Path path = Paths.get("C:/Users/guewe/Downloads/recensement.csv");	
	
	List<String> lines= Files.readAllLines(path, StandardCharsets.UTF_8);
	List<String> fichier = new ArrayList<String>();
	
	for (int i = 0; i < 100; i++) {
		fichier.add(lines.get(i));
	}
	System.out.println(fichier.size());
	
	
		Path newPath = Paths.get("C:/Users/guewe/Downloads/recensement2.csv");
		Files.write(newPath, fichier);
		
		List<String> lines2= Files.readAllLines(newPath, StandardCharsets.UTF_8);
		for (String l : lines2) {
			System.out.println(l);
		}
		System.out.println(lines2.size());
	
	}
}