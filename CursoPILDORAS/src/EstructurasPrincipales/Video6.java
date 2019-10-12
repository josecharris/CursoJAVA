package EstructurasPrincipales;

public class Video6 {
	public static void main(String[] args) {
		int limite = 10;
		int actual = 1;
		int anterior = 0;
		int siguiente = 0;
		int numeros [] = new int [limite];
		Video6 video = new Video6();
		
		for(int i=0;i<limite;i++){
			anterior = actual;
			actual = siguiente;
			siguiente = actual + anterior;
			numeros[i] = siguiente;
		}
		int proved [] = new int [5];
		proved[0]=20;
		proved[1]=17;
		proved[2]=21;
		proved[3]=19;
		proved[4]=30;
		
		System.out.println("FIBONACCI ORDENADO");
		for(Integer numero : video.sortImproved(proved)){
			System.out.println(numero);
		}
	}
	
	public int[] sortFibonacci(int [] unsorted){
		int [] sorted = unsorted;
		for(int auxiliar=sorted.length;auxiliar>0;auxiliar--){
			for(int i=0;i<sorted.length-1;i++){
				if(sorted[i]<sorted[i+1]){
					int numero = sorted[i];
					sorted[i]=sorted[i+1];
					sorted[i+1]=numero;
				}
			}
		}
		return sorted;
	}
	
	public int[] sortImproved(int [] unsorted){
		int buffer;
		for(int i=0;i<unsorted.length;i++){
			for(int j=0;j<i;j++){
				if(unsorted[i]<unsorted[j]){
					buffer = unsorted[j];
					unsorted[j]=unsorted[i];
					unsorted[i]=buffer;
				}
			}
		}
		return unsorted;
	}
	
}
