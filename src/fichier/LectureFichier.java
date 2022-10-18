package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		
		Path pathFile= Paths.get("C:/Users/guewe/Downloads/recensement.csv");
		List<String> lines= Files.readAllLines(pathFile, StandardCharsets.UTF_8);
			
		
		for (String l : lines) {
				
				System.out.println(l);
			
		}
	}

}