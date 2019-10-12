package Bull;

import java.io.IOException;
import java.util.StringTokenizer;

public class Handling {
	private FileReader file;
	
	public Handling(){
		file = new FileReader();
	}
	
	public void load() throws IOException{
		for(String line : file.reader()){
			StringTokenizer token = new StringTokenizer(line, file.getSeparator());
			while(token.hasMoreTokens()){
				String var1 = token.nextToken();
			}
		}
		
	}
	
	
}
