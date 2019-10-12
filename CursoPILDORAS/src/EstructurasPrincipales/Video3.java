package EstructurasPrincipales;

import java.util.Scanner;

//DECLARACION DE CONSTANTES Y OPERADORES
public class Video3 {
	public static void main(String[] args) {
		// ES UN ESPACIO EN LA MEMORIA QUE NO PODRA CAMBIAR
		final double numeroMetroKilometro = 1000;
		final double numero = 200;
		//OPERADORES
		//   ARITMETICOS (+-*/)
		double suma = numeroMetroKilometro+numero;
		double resta = numeroMetroKilometro-numero;
		double multiplicacion = numeroMetroKilometro*numero;
		double division = numeroMetroKilometro/numero;
		//   LOGICOS (<> != == && ||)
		double mayor = (numeroMetroKilometro>numero)?numeroMetroKilometro:numero;
		double menor = (numeroMetroKilometro<numero)? numeroMetroKilometro:numero;
		boolean igual = numeroMetroKilometro==numero;
		boolean diferente = numeroMetroKilometro != numero;
		//   INCREMENTO (++) n+=2;
		if(igual){
			System.out.println("Es igual");
		}
		if(diferente){
			System.out.println("Diferente");
		}
		System.out.println(mayor);
		System.out.println(menor);
		//   DECREMENTO (--) n-=12;
		//   CONCATENACION (+)
		//OPERADORES TERNARIOS
		
		System.out.println("DIGITE UN VALOR : ");
		int numer = new Scanner(System.in).nextInt();
		System.out.println("DIGITE OTRO VALOR : ");
		int numer2 = new Scanner(System.in).nextInt();
		int mayor2 = (numer>numer2)?numer:numer2;
		System.out.println("Mayor : "+mayor2);
		
	}
	
}
