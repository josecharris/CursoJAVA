package EstructurasPrincipales;

import java.util.Objects;

public class Arreglos {
	public static void main(String[] args) {
		int miMatriz [][] = new int [5][5];
		for(int i=0;i<miMatriz.length;i++){
			for (int j = 0; j < miMatriz.length; j++) {
				miMatriz [i][j]=0;
			}
		}
		
		String line = "";
		for(int i=0;i<miMatriz.length;i++){
			for (int j = 0; j < miMatriz.length; j++) {
				line +=" "+miMatriz [i][j];
				if(j==miMatriz.length-1){
					line+="\n";
				}
				
			}
		}
		String a = "a";
		
		if (a instanceof String) {
			System.out.println("Es cadena");
			
		}
		
	}
}
