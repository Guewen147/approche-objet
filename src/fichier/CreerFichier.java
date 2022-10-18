package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CreerFichier {
	public static void main(String[] args) throws IOException {

	Path pathOrigine = Paths.get("C:/Users/guewe/Downloads/recensement.csv");
	Path pathDestination = Paths.get("C:/Users/guewe/Downloads/recensement.csv");
	
	
	Files.copy(pathOrigine, pathDestination, StandardCopyOption.REPLACE_EXISTING);

	}
}