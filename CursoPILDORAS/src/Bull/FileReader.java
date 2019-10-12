package Bull;

import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FileReader extends FilePlain{
	
	public FileReader(){
		
	}
	
	public ArrayList<String> reader() throws IOException{
		ArrayList<String> aux = new ArrayList<>();
		StringTokenizer token = new StringTokenizer(readFile(), "\n");
		while(token.hasMoreTokens()){
			aux.add(token.nextToken());
		}
		return aux;
	}
	
}