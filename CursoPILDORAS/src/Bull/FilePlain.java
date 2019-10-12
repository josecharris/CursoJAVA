package Bull;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FilePlain{
	private String pathFile;
	private String nameFile;
	private String separator;
	private Path path;
	
	public FilePlain(){
		
	}
	
	public void openFile(){
		path = Paths.get(pathFile+nameFile);
	}
	
	public String readFile() throws IOException{
		BufferedReader buffer = Files.newBufferedReader(path, Charset.defaultCharset());
		StringBuilder strBuilder = new StringBuilder();
		String line = "";
		while((line=buffer.readLine())!=null){
			strBuilder.append(line+"\n");
		}
		buffer.close();
		return strBuilder.toString();
	}
	
	public void writeFile(String dates) throws IOException{
		BufferedWriter buffer = Files.newBufferedWriter(path, Charset.defaultCharset(),
				StandardOpenOption.CREATE,StandardOpenOption.WRITE,StandardOpenOption.APPEND);
		buffer.write(dates,0,dates.length());
	}
	
	public String getSeparator(){
		return separator;
	}
	
}