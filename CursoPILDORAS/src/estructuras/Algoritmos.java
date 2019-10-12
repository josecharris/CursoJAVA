package estructuras;

import java.util.Arrays;

public class Algoritmos {
	public static void main(String[] args) {
		Algoritmos algoritmos = new Algoritmos();
		int elemento = 2;
		int [] array = {3,1,10,5,15,20,40};
		Arrays.sort(array);
		System.out.println("init burble");
		for(int element :algoritmos.sortBurble(array)){
			System.out.println(element);
		}
		System.out.println("init burble mejorado");
		for(int element :algoritmos.sortBorbleMejorado(array)){
			System.out.println(element);
		}
		algoritmos.busqueda(array, elemento);
		algoritmos.busquedaBinaria(array, elemento);
	}

	private int busquedaBinaria(int[] arreglo, int valor) {
		// TODO Auto-generated method stub
		int inf = 0; 
		int sup = arreglo.length-1;
		int mitad; 
		
		while (inf <= sup){
			mitad = (inf+sup)/2;
			if (valor == arreglo[mitad]){
				return mitad;
				}
			else if (valor < arreglo[mitad]){
				inf = mitad+1;
				}
			else if (valor > arreglo[mitad]){
				sup = mitad-1;
				}
			}
		return -1;
	}

	private int busqueda(int[] array, int elemento) {
		// TODO Auto-generated method stub
		for(int i=0;i<array.length;i++){
			if(array[i]==elemento){
				return i;
			}
		}
		return 0;
	}

	private int[] sortBorbleMejorado(int[] array) {
		// TODO Auto-generated method stub
		int buffer;
		for(int i=0;i<array.length;i++){
			for(int j=0;j<i;j++){
				if(array[i]<array[j]){
					buffer = array[j];
					array[j]=array[i];
					array[i]=buffer;
				}
			}
		}
		return array;
	}

	private int[] sortBurble(int[] array) {
		// TODO Auto-generated method stub
		int aux;
		for(int i=array.length;i>0;i--){
			for(int j=0;j<array.length-1;j++){
				if(array[j]>array[j+1]){
					aux=array[j];
					array[j]=array[j+1];
					array[j+1]=aux;
				}
			}
		}
		return array;
	}
	
}
