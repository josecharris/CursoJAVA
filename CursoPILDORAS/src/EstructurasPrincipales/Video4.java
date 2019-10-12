package EstructurasPrincipales;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

//CLASES PREDEFINIDAS
public class Video4 {
	public static void main(String[] args) {
		double PI = Math.PI;
		ArrayList<Double>numeros = new ArrayList<>();
	    System.out.println(Integer.toBinaryString(8));
	    try {
			Scanner sc = new Scanner(new File("resource/files/archivo.txt"));
			String linea1 = sc.nextLine();
			String linea2= sc.nextLine();
			StringTokenizer token = new StringTokenizer(linea2, ";");
			while(token.hasMoreTokens()){
			    numeros.add(Double.parseDouble(token.nextToken()));
			}
			
			for (Double numero : numeros){
				System.out.println(numero);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No encontrado");
		}

	}
	
}
