package Ejercicio;
public class Ejercicio {
	public static void main(String[] args) {
		int [][] arr = {{2,3,5,0,1,5},{0,0,1,2,6,7},{2,2,3,3,4,2},{3,3,1,6,2,1},
				       {4,2,3,4,2,1},{5,6,3,1,1,0}};
		int[][]arr2 = {{8,1,6},{3,5,7},{4,9,2}};
		if(new Ejercicio().isMagic(arr2)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}	
	}
	
	public boolean isMagic(int [][] arreglo){
		int suma_filas=0, suma_columnas=0;
		int rel_filas[]=new int[arreglo.length],rel_columnas[]=new int[arreglo.length];
		if(arreglo.length==1){return true;}
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo.length; j++) {
				suma_filas += arreglo[i][j];
				suma_columnas += arreglo[j][i];
			}
			rel_filas[i] = suma_filas; rel_columnas[i] = suma_columnas;
			suma_columnas=0; suma_filas=0;
		}
		return validate(rel_filas,rel_columnas);
	}
	
	public boolean validate(int [] arreglo_fil, int [] arreglo_col){
		int sum_fil=0, sum_col=0;
		for (int i = 0; i < arreglo_fil.length; i++) {
			if(i==arreglo_col.length-1){
				if(arreglo_fil[i]==arreglo_fil[i-1]){
					sum_fil += arreglo_fil[i];
				}else{
					return false;
				}
				if(arreglo_col[i]==arreglo_col[i-1]){
					sum_col += arreglo_col[i];
				}else{
					return false;
				}
			}else{
				if(arreglo_fil[i]==arreglo_fil[i+1]){
					sum_fil += arreglo_fil[i];
				}else{
					return false;
				}
				if(arreglo_col[i]==arreglo_col[i+1]){
					sum_col += arreglo_col[i];
				}else{
					return false;
				}
			}
		}
		return sum_fil==sum_col;
	}
}